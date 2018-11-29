
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Dbcon.Dbconnect"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Untitled Document</title>
    </head>
 <%@include file="Admin_header.jsp" %>
    <body>
        <div align="center">
            <h2>Notification</h2>
            <form method="post">
                Enter Notification:
                <textarea name="tn"  cols="" rows="" required=""></textarea><br>
                    <label>
                        <input type="submit" name="S" value="send"  />
                    </label>
                    <h2>&nbsp;</h2>
                    <%
                        int i = 1;
                        if (request.getParameter("S") != null) {
                            Dbconnect db = new Dbconnect();
                            Connection con = db.connect();
                            Statement stm = con.createStatement();

                            String nt = request.getParameter("tn");

                            stm.executeUpdate("insert into notification_table(notification_content,date)values('" + nt + "', curdate() )");
                        }
                    %>
            </form>  
        </div>
        <p align="center">notification details</p>
        <p>&nbsp;</p>
        <table align="center" border="1">
            <tr>
                <th scope="row">sl/no</th>
                <td>notification content</td>
                <td>date</td>
                <td>-</td>
            </tr>
            <%
                Dbconnect db = new Dbconnect();
                Connection con = db.connect();
                Statement st3 = con.createStatement();
                ResultSet rs = st3.executeQuery("select * from notification_table");
                while (rs.next()) {
            %>

            <tr>
                <td><%=i++%></td>
                <td><%=rs.getString("notification_content")%></td>
                <td><%=rs.getString("date")%></td>
                <td><a href="admin_delete_notification.jsp?id=<%=rs.getString("n_id")%>">DELETE</a></td>
                <%}%>
            </tr>

        </table>
        <center>  <a href="admin_home.jsp">HOME</a></center>
        <p>&nbsp;</p>
    <%@include file="Footer.jsp" %>