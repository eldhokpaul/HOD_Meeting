 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
 <c:forEach items="${feed}" var="feed">
                <tr>
                  <td><c:out value="${feed.hodId}"/></td>

 <td><c:out value="${feed.fname}"/></td>


              
             </tr>
          </c:forEach>