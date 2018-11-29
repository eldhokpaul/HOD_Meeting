package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<div id=\"page\">\n");
      out.write("\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div id=\"navigation\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"admin_home.jsp\">home</a></li>\n");
      out.write("<li><a href=\"admin_view_shop_owners.jsp\">view_shop_owners</a></li>\n");
      out.write("<!--<li><a href=\"admin_view_users.jsp\">view_users</a></li>-->\n");
      out.write("<li><a href=\"admin_send_notifications.jsp\">send_notifications</a></li>\n");
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
      out.write("\t\t\t\t\t<?php\n");
      out.write("}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("?>\n");
      out.write("<script>\n");
      out.write("window.location=\"Index.php\";\n");
      out.write("</script>\n");
      out.write("<?php\n");
      out.write("}\n");
      out.write("?>");
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
