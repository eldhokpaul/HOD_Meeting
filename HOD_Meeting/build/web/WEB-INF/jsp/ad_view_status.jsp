<%@include  file="../header/AD_head.jsp" %>




<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <p align="center">VIEW STATUS </p>
        <table width="929" border="0" align="center" cellpadding="0" >
          <tr>
           
               <th scope="col">MEETING</th>
               <th scope="col">HOD</th>
               <th scope="col">STATUS</th>
          
          </tr>
          <c:forEach items="${feed}" var="feed">
                <tr>
                  <td><c:out value="${feed.meeting.meetingTitle}"/></td>
                   <td><c:out value="${feed.hod.fname}"/></td>

                 <td><c:out value="${feed.status}"/></td>
             </tr>
          </c:forEach>
        </table>
        <h1>&nbsp;</h1>
    </body>
</html>
<%@include  file="../header/footer.jsp" %>