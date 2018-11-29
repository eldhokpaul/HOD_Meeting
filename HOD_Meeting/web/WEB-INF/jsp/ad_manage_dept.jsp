<%-- 
    Document   : ad_manage_dept
    Created on : Sep 15, 2018, 9:40:57 AM
    Author     : HP
--%>

<%@include  file="../header/AD_head.jsp" %>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <body>
        <form action="/hod_meeting/ad_dept_actn" method="post">
            
            <p align="center">MANAGE DEPARTMENT </p>
            <table border="1" style="table" align="center" class="table">
            <tr>
                        <td width="196">DEPARTMENT NAME</td>
                        <td width="144"><input type="text" name="deptName" pattern="[A-Z \s]{0,20}" title="enter a valid department name"  required=""/></td>
              </tr>
                    <tr>
                        <td>HOD</td>
                        <td><select name="hod.hodId" required=""/>
                        <option value="">--select--</option>
                              <c:forEach items="${users}" var="us">
             <option value="${us.hodId}">${us.fname}</option>
                        </c:forEach>
                          
                            </select></td>
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

      
    </table>
        <h1>&nbsp;</h1>
    </body>





<%@include  file="../header/footer.jsp" %>