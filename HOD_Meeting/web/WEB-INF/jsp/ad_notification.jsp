<%-- 
    Document   : ad_notification
    Created on : Sep 27, 2018, 9:02:35 AM
    Author     : HP
--%>

<%@include  file="../header/AD_head.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <h1 align="center">NOTIFICATIONS</h1>
        <form name="form1" method="post" action="/hod_meeting/ad_noti_actn">
          <table width="200" border="1" align="center" cellpadding="0" class="table">
            <tr>
              <td>TITLE</td>
              <td><label>
                      <input type="text" name="meetingTitle" pattern="[A-Z0-9 \s]{0,20}" title="enter a valid title" required="">
              </label></td>
            </tr>
            <tr>
              <td>MEETING DATE </td>
              <td><label>
                      <input type="date" name="meetingDate" required="">
              </label></td>
            </tr>
            <tr>
              <td>VENUE</td>
              <td><label>
                      <input type="text" name="venue" required="" pattern="[A-Z \s]{0,20}" title="enter a valid place name" >
              </label></td>
            </tr>
             <tr>
              <td>TIME</td>
              <td><label>
                      <input type="time" name="time" required="">
              </label></td>
            </tr>
            <tr>
              <td>MESSAGE</td>
              <td><label>
                      <textarea name="message" required="" pattern="[A-Z \s]{0,20}" title="enter a valid first name" ></textarea>
              </label></td>
            </tr>
            <tr>
              <td colspan="2"><div align="center">
                <label>
                <input type="submit" name="Submit" value="Submit">
                </label>
              </div></td>
            </tr>
          </table>
         
        </form>
</body>
</html>
<%@include  file="../header/footer.jsp" %>