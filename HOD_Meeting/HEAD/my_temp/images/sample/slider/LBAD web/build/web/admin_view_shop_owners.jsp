<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="Dbcon.Dbconnect"%>
<html>
    <head>
    </head>
    <%@include file="Admin_header.jsp" %>
    <%
        Dbconnect db = new Dbconnect();
        Connection con = db.connect();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select shop_table.* from shop_table, login where shop_id = login_id and `type` = 'shop'");
    %>

    <h1>shop</h1><table width="100%" border="5">
        <tr>
            <td>shop name</td>
            <td>owner_name</td>                        



            <td>e-mail</td>
            <td>latitude</td>
            <td>longitude</td>
            <td>building_name</td>
            <td>License no</td>
            <td>GST no</td>
            <td>place</td>
            <td>phone</td>
            <td>pin</td>
        </tr>

        <%
            while (rs.next()) {
        %>

        <tr>
            <td><%=rs.getString("shop_name")%></td>
            <td><%=rs.getString("owner_name")%></td>

            <td><%=rs.getString("e_mail")%></td>
            <td><%=rs.getString("latitude")%></td>
            <td><%=rs.getString("longitude")%></td>
            <td><%=rs.getString("building_name")%></td>
            <td><%=rs.getString("lic_no")%></td>
            <td><%=rs.getString("gst_no")%></td>
            <td><%=rs.getString("place")%></td>
            <td><%=rs.getString("phone_no")%></td>
            <td><%=rs.getString("pin_code")%></td>

            <%}%>

        </tr>


    </table>
    <br><br>
    <center><a href="admin_home.jsp">HOME</a></center>
    <%@include file="Footer.jsp" %>