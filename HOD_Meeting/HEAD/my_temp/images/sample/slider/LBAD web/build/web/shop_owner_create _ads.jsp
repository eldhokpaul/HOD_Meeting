<%-- 
    Document   : shop_owner_create _ads.jsp
    Created on : Apr 26, 2018, 11:27:45 AM
    Author     : Amarnath s p
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <tr>
 <h1>create ads</h1>
  <tr><form>
    <table height="102" border="5">
    <tr>
        <th width="74">title</th>
		<th width="317"><input type="text" name="title"></th>
    </tr>
    <tr>
      <th>description </th>
      <th><input type="text" name="discription"></th>
    </tr>
    <tr>
      <th>file</th>
      <th><input type="text" name="file"></th>
    </tr>
     </table>
      </form><input name="submit" type="button" value="submit">
      <%
     String title=request.getParameter("title");
String description=request.getParameter("description");
String file=request.getParameter("file");    
          
          
          
          
      %>
          
      
    <h1> Ads details</h1>
 
        <tr>
   <table width="100" border="5" cellspacing="2" cellpadding="5">
  <tr>
    <th scope="col">ad id  </th>
    <th scope="col">shop id </th>
    <th scope="col">title</th>
    <th scope="col">description</th>
    <th scope="col">date</th>
    <th scope="col">status</th>
    <th scope="col">file</th>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>

    </body>
</html>
