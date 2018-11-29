package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import Dbcon.Dbconnect;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Website template by freewebsitetemplates.com -->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>Lanf Website </title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"background\">\n");
      out.write("\t\t<div id=\"page\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"contents\">\n");
      out.write("\t\t\t\t<div >\n");
      out.write("\t\t\t\t\t<img src=\"images/pic3.jpg\" alt=\"Img\" height=\"249\" width=\"800\">\n");
      out.write("\t\t\t\t\t<h1></h1>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t\t<div id=\"main\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p>A location-aware news feed (LANF) system generates news feeds for a mobile user based on her spatial preference (i.e., her current location and future locations) and non-spatial preference (i.e., her interest). Existing LANF systems simply send the most relevant geo-tagged messages to their users. Unfortunately, the major limitation of such an existing approach is that, a news feed may contain messages related to the same location (i.e., point-of-interest) or the same category of locations (e.g., food, entertainment or sport). We argue that diversity is a very important feature for location-aware news feeds because it helps users discover new places and activities. In this paper, we propose D-MobiFeed; a new LANF system enables a user to specify the minimum number of message categories (h) for the messages in a news feed. In D-MobiFeed, our objective is to efficiently schedule news feeds for a mobile user at her current and predicted locations, such that (i) each news feed contains messages belonging to at least h different categories, and (ii) their total relevance to the user is maximized. To achieve this objective, we formulate the problem into two parts, namely, a decision problem and an optimization problem. For the decision problem, we provide an exact solution by modeling it as a maximum flow problem and proving its correctness. The optimization problem is solved by our proposed three-stage heuristic algorithm. We conduct a user study and experiments to evaluate the performance of D-MobiFeed using a real data set crawled from Foursquare. Experimental results show that our proposed three-stage heuristic scheduling algorithm outperforms the brute-force optimal algorithm by at least an order of magnitude in terms of running time and the relative error incurred by the heuristic algorithm is below 1%. D-MobiFeed with the location prediction method effectively improves the relevance, diversity, and efficiency of news feeds.\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"sidebar\">\n");
      out.write("\t\t\t\t\t<div class=\"section\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n");
      out.write("  <table width=\"350\" border=\"1\">\n");
      out.write("    <tr>\n");
      out.write("      <td width=\"156\">username</td>\n");
      out.write("      <td width=\"178\"><input type=\"text\" name=\"u\" required=\"\" /></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>password</td>\n");
      out.write("      <td><input type=\"password\" name=\"p\" required=\"\"  /></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td><label>\n");
      out.write("        <input type=\"submit\" name=\"S\" value=\"Submit\" />\n");
      out.write("      </label></td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("  <label></label>\n");
      out.write("</form>\n");
      out.write("<p>&nbsp;</p>\n");
      out.write("</body>\n");
      out.write("</html>\n");

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
    { 
      out.write("\n");
      out.write("        <script>  alert(\"Invalid userid  or password..\");   </script>\n");
      out.write(" ");
 }
  }


      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"section\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<div id=\"connect\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" target=\"_blank\" class=\"pinterest\"></a> <a href=\"#\" target=\"_blank\" class=\"facebook\"></a> <a href=\"#\" target=\"_blank\" class=\"twitter\"></a> <a href=\"#\" target=\"_blank\" class=\"\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t� 2023  All Rights Reserved\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
