<%-- 
    Document   : Index
    Created on : Jun 23, 2018, 11:01:46 AM
    Author     : Amarnath s p
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Dbcon.Dbconnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<title>Lanf Website </title>
	<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>
   
	<div id="background">
             <br>
             <hi style="color:white;font-size: 60px;margin-left: 300px" > <b> LOCATION BASED AD'S </b></hi><br>
		<div id="page">
		
			<div id="header">
			<div id="logo">
					
						</div>
				
				
			</div>
			<div id="contents">
				<div >
					<img src="images/pic3.jpg" alt="Img" height="249" width="800">
					<h1></h1>
					<p>
					</p>
			  </div>
				<div id="main">
					
					<p>A location-aware news feed (LANF) system generates news feeds for a mobile user based on her spatial preference (i.e., her current location and future locations) and non-spatial preference (i.e., her interest). Existing LANF systems simply send the most relevant geo-tagged messages to their users. Unfortunately, the major limitation of such an existing approach is that, a news feed may contain messages related to the same location (i.e., point-of-interest) or the same category of locations (e.g., food, entertainment or sport). We argue that diversity is a very important feature for location-aware news feeds because it helps users discover new places and activities. In this paper, we propose D-MobiFeed; a new LANF system enables a user to specify the minimum number of message categories (h) for the messages in a news feed. In D-MobiFeed, our objective is to efficiently schedule news feeds for a mobile user at her current and predicted locations, such that (i) each news feed contains messages belonging to at least h different categories, and (ii) their total relevance to the user is maximized. To achieve this objective, we formulate the problem into two parts, namely, a decision problem and an optimization problem. For the decision problem, we provide an exact solution by modeling it as a maximum flow problem and proving its correctness. The optimization problem is solved by our proposed three-stage heuristic algorithm. We conduct a user study and experiments to evaluate the performance of D-MobiFeed using a real data set crawled from Foursquare. Experimental results show that our proposed three-stage heuristic scheduling algorithm outperforms the brute-force optimal algorithm by at least an order of magnitude in terms of running time and the relative error incurred by the heuristic algorithm is below 1%. D-MobiFeed with the location prediction method effectively improves the relevance, diversity, and efficiency of news feeds.


					</p>
				</div>
				<div id="sidebar">
					<div class="section">
					
						<form id="form1" name="form1" method="post" action="">
  <table width="350" border="1">
    <tr>
      <td width="156">username</td>
      <td width="178"><input type="text" name="u" required="" /></td>
    </tr>
    <tr>
      <td>password</td>
      <td><input type="password" name="p" required=""  /></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><label>
        <input type="submit" name="S" value="Submit" />
      </label></td>
    </tr>
  </table>
  <label></label>
</form>
<p>&nbsp;</p>
</body>
</html>
<%
    if(request.getParameter("S")!=null)
    {
    String un=request.getParameter("u");
    String pw=request.getParameter("p");

        Dbconnect db=new Dbconnect();
        Connection con=db.connect();
        Statement st=con.createStatement();

ResultSet rs=st.executeQuery("select * from login where username='"+un+"' and password='"+pw+"' ");
if(rs.next())
{
    String type=rs.getString(4);
    
    if(type.equalsIgnoreCase("admin"))
    {
     response.sendRedirect("admin_home.jsp");   
    }
 
}
else
    { %>
        <script>  alert("Invalid userid  or password..");   </script>
 <% }
  }

%>
					</div>
					<div class="section">
					</div>
					
				</div>
			</div>
		</div>
		<div id="footer">
			<div>
				<div id="connect">
					<a href="#" target="_blank" class="pinterest"></a> <a href="#" target="_blank" class="facebook"></a> <a href="#" target="_blank" class="twitter"></a> <a href="#" target="_blank" class=""></a>
				</div>
			</div>
			<p>
				� 2023  All Rights Reserved
			</p>
		</div>
	</div>
</body>
</html>