<%-- 
    Document   : admin_accept_shop
    Created on : Jun 22, 2018, 4:30:33 PM
    Author     : Amarnath s p
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Dbcon.Dbconnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        try {
            String id = request.getParameter("id");
            Dbconnect db = new Dbconnect();
            Connection con = db.connect();
            Statement st = con.createStatement();
            int a = st.executeUpdate("update login set `type` = 'shop' where login_id = " + id);
            if (a > 0) {
                 int b = st.executeUpdate("update shop_table set status='accepted' where shop_id =  '"+id+"'");
    %>
    <script>
        alert("Accepted.!");
        window.location = "admin_view_shop_owners.jsp";
    </script>
    <%
            }
        } catch (Exception e) {
        }
    %>
</html>
