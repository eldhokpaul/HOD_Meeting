package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admin_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=iso-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- Website template by freewebsitetemplates.com -->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Bhaccasyoniztas Beach Resort Website Template</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"background\">\r\n");
      out.write("\t\t<div id=\"page\">\r\n");
      out.write("\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div id=\"navigation\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"admin_home.jsp\">home</a></li>\r\n");
      out.write("<li><a href=\"admin_view_shop_owners.jsp\">View_shop_owners</a></li>\r\n");
      out.write("<!--<li><a href=\"admin_view_users.jsp\">view_users</a></li>-->\r\n");
      out.write("<li><a href=\"admin_send_notifications.jsp\">send_notifications</a></li>\r\n");
      out.write("<li><a href=\"login.jsp\">LOGOUT</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<h1></h1>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t\t\t<h1><font color=\"#336699\">A Location- and Diversity-aware News Feed System for Mobile Users\r\n");
      out.write("</font></h1>\r\n");
      out.write("\t\t\t\t\t<p>A location-aware news feed (LANF) system generates news feeds for a mobile user based on her spatial preference (i.e., her current location and future locations) and non-spatial preference (i.e., her interest). Existing LANF systems simply send the most relevant geo-tagged messages to their users. Unfortunately, the major limitation of such an existing approach is that, a news feed may contain messages related to the same location (i.e., point-of-interest) or the same category of locations (e.g., food, entertainment or sport). We argue that diversity is a very important feature for location-aware news feeds because it helps users discover new places and activities. In this paper, we propose D-MobiFeed; a new LANF system enables a user to specify the minimum number of message categories (h) for the messages in a news feed. In D-MobiFeed, our objective is to efficiently schedule news feeds for a mobile user at her current and predicted locations, such that (i) each news feed contains messages belonging to at least h different categories, and (ii) their total relevance to the user is maximized\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t\t\t<div class=\"section\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"section\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div id=\"connect\">\r\n");
      out.write("\t\t\t\t\t<a href=\"http://pinterest.com/fwtemplates/\" target=\"_blank\" class=\"pinterest\"></a> <a href=\"http://freewebsitetemplates.com/go/facebook/\" target=\"_blank\" class=\"facebook\"></a> <a href=\"http://freewebsitetemplates.com/go/twitter/\" target=\"_blank\" class=\"twitter\"></a> <a href=\"http://freewebsitetemplates.com/go/googleplus/\" target=\"_blank\" class=\"googleplus\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t? 2023 by BHACCASYONIZTAS BEACH RESORT. All Rights Reserved\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html></html>\r\n");
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
