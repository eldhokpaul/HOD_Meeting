<%-- 
    Document   : ad_view_dept
    Created on : Oct 20, 2018, 5:29:23 PM
    Author     : HP
--%>
<%@include  file="../header/AD_head.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <p align="center">View Department </p>
       <table width="523" border="1" align="center" cellpadding="0" class="table">
          <tr>
            <th width="194" scope="col">HOD</th>
             <th width="317" scope="col">DEPARTMENT NAME</th>
           </tr>
             <c:forEach items="${feed}" var="feed">
                <tr>
                    <td><c:out value="${feed.hod.fname}"/></td>
                    <td><c:out value="${feed.deptName}"/></td>
                  
                </tr>
             </c:forEach>
       </table><%@include  file="../header/footer.jsp" %>
 