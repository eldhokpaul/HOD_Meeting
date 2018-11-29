package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import Dbcon.Dbconnect;

public final class admin_005fview_005fshop_005fowners_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Admin_header.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Website template by freewebsitetemplates.com -->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>Bhaccasyoniztas Beach Resort Website Template</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"background\">\n");
      out.write("             <br>\n");
      out.write("             <hi style=\"color:white;font-size: 60px;margin-left: 300px\" > <b> LOCATION BASED AD'S </b></hi><br>\n");
      out.write("\t\t<div id=\"page\">\n");
      out.write("\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div id=\"navigation\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"admin_home.jsp\">HOME</a></li>\n");
      out.write("<li><a href=\"admin_view_shop_owners.jsp\">SHOP OWNERS</a></li>\n");
      out.write("<!--<li><a href=\"admin_view_users.jsp\">view_users</a></li>-->\n");
      out.write("<li><a href=\"admin_send_notifications.jsp\">NOTIFICATIONS</a></li>\n");
      out.write("<li><a href=\"login.jsp\">LOGOUT</a></li>\n");
      out.write("</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"contents\">\n");
      out.write("\t\t\t\t<div >\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<h1></h1>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"main\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("    ");

        Dbconnect db = new Dbconnect();
        Connection con = db.connect();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select shop_table.* from shop_table, login where shop_id = login_id and `type` = 's_pending'");
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <h1>shop</h1><table width=\"100%\" border=\"5\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>shop name</td>\r\n");
      out.write("            <td>owner_name</td>                        \r\n");
      out.write("        \r\n");
      out.write("           \r\n");
      out.write("            <td>latitude</td>\r\n");
      out.write("             <td>e-mail</td>\r\n");
      out.write("            <td>longitude</td>\r\n");
      out.write("            <td>building_name</td>\r\n");
      out.write("            <td>License no</td>\r\n");
      out.write("            <td>GST no</td>\r\n");
      out.write("            <td>place</td>\r\n");
      out.write("            <td>phone</td>\r\n");
      out.write("            <td>pin</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        ");

            while (rs.next()) {
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>");
      out.print(rs.getString("shop_name"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("owner_name"));
      out.write("</td>\r\n");
      out.write("           \r\n");
      out.write("            <td>");
      out.print(rs.getString("e_mail"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("latitude"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("longitude"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("building_name"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("lic_no"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("gst_no"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("place"));
      out.write("</td>\r\n");
      out.write("             <td>");
      out.print(rs.getString("phone_no"));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString("pin_code"));
      out.write("</td>\r\n");
      out.write("            <td><a href=\"admin_accept_shop.jsp?id=");
      out.print(rs.getString("shop_id"));
      out.write("\"><input type=\"button\" value=\"Accept\" /></a></td>\r\n");
      out.write("            <td><a href=\"admin_reject_shop.jsp?id=");
      out.print(rs.getString("shop_id"));
      out.write("\"><input type=\"button\" value=\"Decline\" /></a></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <center><a href=\"admin_home.jsp\">HOME</a></center>\r\n");
      out.write("\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"sidebar\">\n");
      out.write("\t\t\t\t\t<div class=\"section\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"section\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<div id=\"connect\">\n");
      out.write("\t\t\t\t\t<a href=\"http://pinterest.com/fwtemplates/\" target=\"_blank\" class=\"pinterest\"></a> <a href=\"http://freewebsitetemplates.com/go/facebook/\" target=\"_blank\" class=\"facebook\"></a> <a href=\"http://freewebsitetemplates.com/go/twitter/\" target=\"_blank\" class=\"twitter\"></a> <a href=\"http://freewebsitetemplates.com/go/googleplus/\" target=\"_blank\" class=\"googleplus\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t© 2023 by BHACCASYONIZTAS BEACH RESORT. All Rights Reserved\n");
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
