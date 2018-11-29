<%-- 
    Document   : admin_delete_notification
    Created on : Jun 22, 2018, 5:39:26 PM
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
            int a = st.executeUpdate("delete from notification_table where n_id = " + id);
            if (a > 0) {
    %>
    <script>
        alert("Deleted.!");
        window.location = "admin_send_notifications.jsp";
    </script>
    <%
            }
        } catch (Exception e) {
        }
    %>
</html>
