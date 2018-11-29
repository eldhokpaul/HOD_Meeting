
<%@include  file="../header/AD_head.jsp" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<body background="blue">
<form action="/hod_meeting/ad_manage_hod_actn" method="post">
    
    <table align="center">
        <p align="center">New Registration!!!!</p>
        <tr><td>FIRSTNAME:</td><td><input type="text" name="fname" pattern="[A-Z \s]{0,20}" title="enter a valid first name" required=""></td></tr>
        <tr><td>LASTNAME:</td><td><input type="text" name="lname" pattern="[A-Z \s]{0,20}" title="enter a valid last name" required=""></td></tr>
       
        <tr><td>PHONE:</td><td><input type="text" name="phone" pattern="[0-9]{10}" title="enter a valid 10 digit mobile number" required=""></td></tr>
        <tr><td>EMAIL:</td><td><input type="email" name="email" required=""></td></tr>
<tr>
                        <td width="196">DEPARTMENT NAME</td>
                        <td width="144"><input type="text" name="deptName" pattern="[A-Z \s]{0,20}" title="enter a valid department name"  required=""/></td>
              </tr>
        <tr><td>USERNAME:</td>
            <td><input type="text" name="username" required=""></td></tr>
        <tr><td>PASSWORD:</td><td><input type="password" name="password" required=""></td></tr>
        <tr><td colspan="2"><div align="center">
        <label>
        <input type="submit" name="Submit" value="Submit">
            </label>
          </div></td></tr>
    </table>
</form><%@include  file="../header/footer.jsp" %>
</body>