<%@page import="Dbcon.Dbconnect"%>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>

<h2>USERS</h2>
<table width="100%" border="5">
  <tr>
    <th scope="row">user_id</th>
    <td>fname</td>
    <td>Lname</td>
    <td>DOB</td>
    <td>latittude</td>
    <td>longitude</td>
    <td>phone_no</td>
    <td>e-mail</td>
    <td>place</td>
	
  </tr>
  <%
Dbconnect db=new Dbconnect();
Connection con=db.connect();
Statement st5=con.createStatement();
ResultSet rs=st5.executeQuery("select * from user_table");
%>
   <%
  while(rs.next())
  {
  %>
  <tr>
    <td><%=rs.getString("f_name")%>/td>
    <td><%=rs.getString("l_name")%></td>
    <td><%=rs.getString("DOB")%></td>
    <td><%=rs.getString("latitude")%></td>
    <td><%=rs.getString("longitude")%></td>
    <td><%=rs.getString("phone")%></td>
    <td><%=rs.getString("e_mail")%></td>
    <td><%=rs.getString("place")%></td>
   
	<td><input name="accept" type="button" value="accept" /></td>
	<td><input name="decline" type="button" value="decline" /></td></td>
  </tr>
  
  <%  } %>
  
  
  
  
  
  

  <tr>
    <th scope="row">&nbsp;</th>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table><br><br>
        <center> <a href="admin_home.jsp">HOME</a></center>
</body>
</html>
