<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Dbcon.Dbconnect"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>

 <h1> User registration</h1>
 
 <form method="post">
    <table height="102" border="1">
    <tr>
        <th width="74">First name</th>
		<th width="317"><input type="text" name="fname"></th>
    </tr>
    <tr>
      <th>Last name </th>
      <th><input type="text" name="lname"></th>
    </tr>
	<tr><th>DOB</th>
	<th><input type="text" name="DOB"></th>
	</tr>
	<tr><th>latitude</th>
	<th><input type="text" name="latitude"></th>
	</tr>
	<tr><th>longitude</th>
	<th><input type="text" name="longitude"></th>
	</tr>
	<tr><th>phone_no</th>
	<th><input type="text" name="phone_no"></th>
	</tr>
	<tr><th>e-mail</th>
	<th><input type="text" name="email"></th>
	</tr>
	<tr><th>place</th>
	<th><input type="text" name="place"></th>
	</tr>
        <tr><th>Set username</th>
	<th><input type="text" name="un"></th>
	</tr>
        <tr><th>Set Password</th>
	<th><input type="text" name="pw"></th>
	</tr>
        
        
	<tr>
            <td colspan="2">
        <input type="submit" name="S" value="Submit" />
      </td>
    </tr>
	
</table>


</form>
<%
    if(request.getParameter("S")!=null)
    {
String fn=request.getParameter("fname");
String ln=request.getParameter("lname");
String dob=request.getParameter("DOB");
String lat=request.getParameter("latitude");
String lon=request.getParameter("longitude");
String phone=request.getParameter("phone_no");
String email=request.getParameter("email");
String place=request.getParameter("place");

String un=request.getParameter("un");
String pw=request.getParameter("pw");

Dbconnect db=new Dbconnect();
Connection con=db.connect();
Statement st=con.createStatement();


st.executeUpdate("insert into login(username,password,type)values('"+un+"','"+pw+"','user')");

st.executeUpdate("insert into user_table values((select max(login_id)from login),'"+fn+"','"+ln+"','"+dob+"','"+lat+"','"+lon+"','"+phone+"','"+email+"','"+place+"')");




    }


%>