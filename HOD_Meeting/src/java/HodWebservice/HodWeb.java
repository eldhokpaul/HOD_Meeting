/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HodWebservice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author HP
 */
@WebService(serviceName = "HodWeb")
public class HodWeb {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
         String res = "failed";
        try {
            Dbconnect db = new Dbconnect();
            Connection con = db.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from login where username = '" + username + "' and password = '" + password + "'");
            if (rs.next()) {
                res = rs.getString(1)+"$"+rs.getString(4);
            } else {
                res = "failed";
            }
        } catch (Exception e) {
            res = e.toString();
        }
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "view_meetings")
    public String view_meetings() {
         String res = "";
        try {
            Dbconnect db = new Dbconnect();
            Connection con = db.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from meeting");
           
             if (rs.next()) {
                res = "";
                do {
                    res += rs.getString(1) + "#" + rs.getString(2) + "#" + rs.getString(4) + "#" + rs.getString(5) + "#" + rs.getString(6) + "# " + rs.getString(7) +"^";
           } while (rs.next());
            }else{
                 res="failed";
             }
            
            
        } catch (Exception e) {
            res = e.toString();
        }
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "send_reply")
    public String send_reply(@WebParam(name = "logid") String logid, @WebParam(name = "mid") String mid, @WebParam(name = "rep") String rep) {
         String res = "not";
        try {
            Dbconnect db = new Dbconnect();
            Connection con = db.connect();
            Statement st = con.createStatement();
            int a = st.executeUpdate("INSERT INTO `meeting_reply`(`hod_id`,`meeting_id`,`reply_message`,`date`)values('"+logid+"','"+mid+"','"+rep+"',curdate())");
            if (a > 0) {
                res = "ok";
            }
        } catch (Exception e) {
//            System.out.println("err:" + e);
        }
        return res;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "update_status")
    public String update_status(@WebParam(name = "hodid") String hodid, @WebParam(name = "mid") String mid, @WebParam(name = "status") String status) {
         String res = "not";
        try {
            Dbconnect db = new Dbconnect();
            Connection con = db.connect();
            Statement st = con.createStatement();
            
            ResultSet rs=st.executeQuery("SELECT *  from `hod`  where logid='"+hodid+"'");
            if(rs.next()){
                String m=rs.getString(1);
            
            
            
            int a = st.executeUpdate("INSERT INTO `meeting_status`(`meeting_id`,`hod_id`,`status`)values('"+mid+"','"+m+"','"+status+"')");
            if (a > 0) {
                res = "ok";
            }}
        } catch (Exception e) {
//            System.out.println("err:" + e);
        }
        return res;
    }
    @WebMethod(operationName = "staff_registration")
    public String staff_registration(@WebParam(name = "hodid") String hodid, @WebParam(name = "fname") String fname, @WebParam(name = "lname") String lname,@WebParam(name = "phno") String phno,@WebParam(name = "email") String email,@WebParam(name = "qual") String qual,@WebParam(name = "username") String username,@WebParam(name = "password") String password) {
         String res = "not";
        try {
            Dbconnect db = new Dbconnect();
            Connection con = db.connect();
            Statement st = con.createStatement();
            
             ResultSet rs=st.executeQuery("SELECT *  from `hod`  where logid='"+hodid+"'");
            if(rs.next()){
                String m=rs.getString(1);
            
            

            
            
            int a = st.executeUpdate("INSERT INTO `login`(`username`,`password`,`type`)values('"+username+"','"+password+"','staff')");
            if (a > 0) {
                int b=st.executeUpdate("INSERT INTO `staff`(`logid`,`hod_id`,`fname`,`lname`,`phone`,`email`,`qualification`)VALUES((SELECT MAX(logid)FROM login),'"+m+"','"+fname+"','"+lname+"','"+phno+"','"+email+"','"+qual+"')");
                if(b>0){ 
                    res = "ok";
            }}}
        } catch (Exception e) {
//            System.out.println("err:" + e);
        }
        return res;
    
    }
        
        @WebMethod(operationName = "view_staff_notification")
    public String view_staff_notification(@WebParam(name = "logid") String logid) {
        String res = "";
        try {
            Dbconnect db = new Dbconnect();
            Connection con = db.connect();
            Statement st = con.createStatement();
            
            
//             ResultSet rs2=st.executeQuery("SELECT *  from `hod`  where logid='"+logid+"'");
//            if(rs2.next()){
//                String m=rs2.getString(1);
//            
//            
            
            ResultSet rs = st.executeQuery("SELECT meeting_title,fname,lname FROM meeting_status INNER JOIN meeting USING(meeting_id) INNER JOIN hod USING (hod_id) WHERE meeting_status.hod_id=(SELECT hod_id FROM staff WHERE logid='"+logid+"')");
           
             if (rs.next()) {
                res = "";
                do {
                    res +=  rs.getString(1) + "#" + rs.getString(2) + "#" + rs.getString(3) +"^";
           } while (rs.next());
            }else{
                 res="failed";
             }
            
            
        } catch (Exception e) {
            res = e.toString();
        }
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "change_password")
    public String change_pasword(@WebParam(name = "logid") String logid, @WebParam(name = "oldpass") String oldpass, @WebParam(name = "newpass") String newpass) {
    
         String res = "not";
        try {
            Dbconnect db = new Dbconnect();
            Connection con = db.connect();
            Statement st = con.createStatement();
            
             ResultSet rs=st.executeQuery("SELECT *  from login  where logid='"+logid+"'");
            if(rs.next()){
                String m=rs.getString(3);
            
            if(m.equalsIgnoreCase(oldpass)){
                int a=st.executeUpdate("update login set password='"+newpass+"' where logid='"+logid+"'");
           if(a>0){
               res="ok";
           }
                        }else{
                res="failed";
            }

            
            
//            int a = st.executeUpdate("INSERT INTO `login`(`username`,`password`,`type`)values('"+username+"','"+password+"','staff')");
//            if (a > 0) {
//                int b=st.executeUpdate("INSERT INTO `staff`(`logid`,`hod_id`,`fname`,`lname`,`phone`,`email`,`qualification`)VALUES((SELECT MAX(logid)FROM login),'"+m+"','"+fname+"','"+lname+"','"+phno+"','"+email+"','"+qual+"')");
//                if(b>0){ 
//                    res = "ok";
//            }}
            }
        } catch (Exception e) {
//            System.out.println("err:" + e);
        }
        return res;
        
        
        
    }
        
        
}
