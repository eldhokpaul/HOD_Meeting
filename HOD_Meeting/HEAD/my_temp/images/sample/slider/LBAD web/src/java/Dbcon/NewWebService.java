/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dbcon;

import java.io.File;
import java.io.FileOutputStream;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Amarnath s p
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "shopreg")
    public String shopreg(@WebParam(name = "shopname") String shopname, @WebParam(name = "ownername") String ownername, @WebParam(name = "phoneno") String phoneno, @WebParam(name = "email") String email, @WebParam(name = "latitude") String latitude, @WebParam(name = "longitude") String longitude, @WebParam(name = "buildingname") String buildingname, @WebParam(name = "place") String place, @WebParam(name = "pincode") String pincode, @WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "lic") String lic, @WebParam(name = "gst") String gst) {
        String res = "";
        Dbconnect db = new Dbconnect();
        Connection con = db.connect();
        try {
            Statement st = con.createStatement();
            int a = 0;
            int b = 0;
            a = st.executeUpdate("INSERT INTO `login`(`username`, `password`, `type`) VALUES ('" + username + "','" + password + "','s_pending')");
            b = st.executeUpdate("insert into shop_table(shop_id,shop_name,owner_name,phone_no,e_mail,latitude,longitude,building_name,place,pin_code,status,cat_id,lic_no, gst_no) values ((select max(login_id) from login),'" + shopname + "','" + ownername + "','" + phoneno + "','" + email + "','" + latitude + "','" + longitude + "','" + buildingname + "','" + place + "','" + pincode + "','pending','1','" + lic + "','" + gst + "')");
            if (b > 0) {
                res = "ok";
            } else {
                res = "failed";
            }

        } catch (Exception e) {
            out.println(e);
        }
        //TODO write your implementation code here:
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "userreg")
    public String userreg(@WebParam(name = "fname") String fname, @WebParam(name = "lname") String lname, @WebParam(name = "dob") String dob, @WebParam(name = "latitude") String latitude, @WebParam(name = "longitude") String longitude, @WebParam(name = "phone") String phone, @WebParam(name = "email") String email, @WebParam(name = "place") String place, @WebParam(name = "username") String username, @WebParam(name = "password") String password) {

        String ret = "";
        Dbconnect db = new Dbconnect();
        Connection con = db.connect();
        try {
            Statement st = con.createStatement();
            int a = 0;
            int b = 0;
            a = st.executeUpdate("INSERT INTO `login`(`username`, `password`, `type`) VALUES ('" + username + "','" + password + "','user')");
            b = st.executeUpdate("insert into user_table(user_id,f_name,l_name,DOB,latitude,longitude,phone,e_mail,place) values((select max(login_id) from login),'" + fname + "','" + lname + "','" + dob + "','" + latitude + "','" + longitude + "','" + phone + "','" + email + "','" + place + "')");
            if (b > 0) {
                ret = "ok";
            } else {
                ret = "failed";
            }

        } catch (Exception e) {
            out.println(e);
        }

//TODO write your implementation code here:
        return ret;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {

        String ret = "";
        Dbconnect db = new Dbconnect();
        Connection con = db.connect();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from login where username='" + username + "'and password='" + password + "'");
            if (rs.next()) {
                ret = rs.getString(1) + "#" + rs.getString(4);
            } else {
                ret = "failed";
            }
        } catch (Exception e) {
            ret = e.toString();
        }
        return ret;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "createads")
    public String createads(@WebParam(name = "shop_id") String shop_id, @WebParam(name = "title") String title, @WebParam(name = "description") String description, @WebParam(name = "photo") String photo) {
        //TODO write your implementation code here:
        String ret = "";
        Dbconnect db = new Dbconnect();
        Connection con = db.connect();
        try {
            Statement st = con.createStatement();
            int a = 0;
            int b = 0;
            ResultSet rs = st.executeQuery("select max(ad_id) from ads_table");
            if (rs.next()) {
                String filename = rs.getString(1) + ".jpg";
                String folder = "C:\\Users\\Amarnath s p\\Documents\\NetBeansProjects\\LBAD\\web\\ads\\";
                File fil = new File(folder + filename);
                if (!fil.exists()) {
                    fil.createNewFile();
                }
                FileOutputStream fos = new FileOutputStream(fil);
                byte[] img = Base64.decodeBase64(photo);
                fos.write(img);
                fos.flush();
                fos.close();
                b = st.executeUpdate("insert into ads_table(shop_id,title,description,date,status,file) values('" + shop_id + "','" + title + "','" + description + "',curdate(),'added','" + filename + "')");
                if (b > 0) {
                    ret = "ok";
                } else {
                    ret = "failed";
                }
            }
        } catch (Exception e) {
            out.println(e);
        }

//TODO write your implementation code here:
        return ret;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "near_shop")
    public String near_shop(@WebParam(name = "lati") String lati, @WebParam(name = "longi") String longi) throws SQLException {
        String ret = "";  //TODO write your implementation code here:
        Dbconnect db = new Dbconnect();
        Connection con = db.connect();
        Statement st1 = con.createStatement();
        ResultSet rs1 = st1.executeQuery("select shop_table.*,(3959 * acos ( cos ( radians('" + lati + "') ) * cos( radians( latitude) ) * cos( radians( longitude ) - radians('" + longi + "') ) + sin ( radians('" + lati + "') ) * sin( radians( latitude ) ))) AS user_distance FROM shop_table where status='accepted' HAVING user_distance  < 10.068 ");
        while (rs1.next()) {
            ret += rs1.getString(1) + "@" + rs1.getString(2) + "@" + rs1.getString(3) + "@" + rs1.getString(4) + "@" + rs1.getString(8) + "@" + rs1.getString(9) + "@" + rs1.getString(8) + "@" + rs1.getString(9) + "#";
        }
        return ret;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "view_ads")
    public String view_ads(@WebParam(name = "lati") String lati, @WebParam(name = "longi") String longi) {
        String ret = "na";  //TODO write your implementation code here:
        Dbconnect db = new Dbconnect();
        Connection con = db.connect();

        try {
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery("select shop_table.shop_name,ads_table.*,shop_table.latitude,shop_table.longitude ,(3959 * acos ( cos ( radians('" + lati + "') ) * cos( radians( latitude) ) * cos( radians( longitude ) - radians('" + longi + "') ) + sin ( radians('" + lati + "') ) * sin( radians( latitude ) ))) AS user_distance FROM shop_table,ads_table where ads_table.shop_id=shop_table.shop_id HAVING user_distance  < 10.068 ");
            if (rs1.next()) {
                ret = "";
                do {
                    ret += rs1.getString(1) + "@" + rs1.getString(2) + "@" + rs1.getString(3) + "@" + rs1.getString(4) + "@" + rs1.getString(5) + "@" + rs1.getString(6) + "@" + rs1.getString(7) + "@" + rs1.getString(8) + "#";
                } while (rs1.next());
            }
        } catch (Exception e) {

        }
        return ret;
    }

    @WebMethod(operationName = "shop_view_ads")
    public String shop_view_ads(@WebParam(name = "shop_id") String shop_id) {
        String ret = "na";  //TODO write your implementation code here:
        Dbconnect db = new Dbconnect();
        Connection con = db.connect();

        try {
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery("select shop_table.shop_name,ads_table.* from shop_table,ads_table where ads_table.shop_id=shop_table.shop_id and ads_table.shop_id='" + shop_id + "' order by ad_id desc");
            if (rs1.next()) {
                ret = "";
                do {
                ret += rs1.getString(1) + "@" + rs1.getString(2) + "@" + rs1.getString(3) + "@" + rs1.getString(4) + "@" + rs1.getString(5) + "@" + rs1.getString(6) + "@" + rs1.getString(7) + "@" + rs1.getString(8) + "#";
                } while (rs1.next());
            }
        } catch (Exception e) {

        }
        return ret;
    }

    @WebMethod(operationName = "view_notification")
    public String view_notification() {
        String ret = "";  //TODO write your implementation code here:
        Dbconnect db = new Dbconnect();
        Connection con = db.connect();

        try {
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery("select * from notification_table ");
            while (rs1.next()) {
                ret += rs1.getString(1) + "@" + rs1.getString(2) + "@" + rs1.getString(3) + "#";
            }
        } catch (Exception e) {

        }
        return ret;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "shop_profile")
    public String shop_profile(@WebParam(name = "shop_id") String shop_id) {
        //TODO write your implementation code here:
        String res = "";
        Dbconnect db = new Dbconnect();
        Connection con = db.connect();
        try {
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery("select * from shop_table where shop_id='" + shop_id + "'");
            if (rs1.next()) {
                res = rs1.getString(2) + "#" + rs1.getString(3) + "#" + rs1.getString(4) + "#" + rs1.getString(5) + "#" + rs1.getString(8) + "#" + rs1.getString(9) + "#" + rs1.getString(10);
            } else {
                res = "na";
            }
        } catch (Exception e) {

        }
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "shop_update")
    public String shop_update(@WebParam(name = "shop_id") String shop_id, @WebParam(name = "shopname") String shopname, @WebParam(name = "shopowner") String shopowner, @WebParam(name = "phone") String phone, @WebParam(name = "email") String email, @WebParam(name = "buildingname") String buildingname, @WebParam(name = "place") String place, @WebParam(name = "pin") String pin) {
        String res = "";
        Dbconnect db = new Dbconnect();
        Connection con = db.connect();
        try {
            Statement st = con.createStatement();
            int a = 0;
            int b = 0;
            //a = st.executeUpdate("INSERT INTO `login`(`username`, `password`, `type`) VALUES ('" + username + "','" + password + "','s_pending')");
            b = st.executeUpdate("update shop_table set shop_name='" + shopname + "',owner_name='" + shopowner + "',phone_no='" + phone + "',e_mail='" + email + "',building_name='" + buildingname + "',place='" + place + "',pin_code='" + pin + "' where shop_id='" + shop_id + "' ");
            if (b > 0) {
                res = "ok";
            } else {
                res = "failed";
            }

        } catch (Exception e) {
            out.println(e);
        }
        //TODO write your implementation code here:
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ad_delete")
    public String ad_delete(@WebParam(name = "ad_id") String ad_id) {
        String res = "";
        Dbconnect db = new Dbconnect();
        Connection con = db.connect();
        try {
            Statement st = con.createStatement();
            int a = st.executeUpdate("delete from ads_table where ad_id='" + ad_id + "'");
            if (a > 0) {
                res = "ok";
            } else {
                res = "failed";
            }

        } catch (Exception e) {
            out.println(e);
        }
        //TODO write your implementation code here:
        return res;
    }
}
