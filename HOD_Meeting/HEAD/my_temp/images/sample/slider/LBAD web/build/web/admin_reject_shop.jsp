<%-- 
    Document   : admin_reject_shop
    Created on : Jun 22, 2018, 4:30:53 PM
    Author     : Amarnath s p
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Dbcon.Dbconnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        try {
            String id = request.getParameter("id");
            Dbconnect db = new Dbconnect();
            Connection con = db.connect();
            Statement st = con.createStatement();
            int a = st.executeUpdate("update login set `type` = 's_reject' where login_id = " + id);
            if (a > 0) {
    %>
    <script>
        alert("Declained.!");
        window.location = "admin_view_shop_owners.jsp";
    </script>
    <%
            }
        } catch (Exception e) {
        }
    %>
</html>
