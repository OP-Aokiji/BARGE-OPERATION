/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-05-31 03:39:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class topmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/ProjectC/Server%20HHT/BARGE-OPERATION/SERVER-WS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BargeOperation/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/D:/ProjectC/Server%20HHT/BARGE-OPERATION/SERVER-WS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BargeOperation/WEB-INF/lib/spring-webmvc-4.0.6.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1404739798000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.0.6.RELEASE.jar", Long.valueOf(1462786954284L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1462786975813L));
    _jspx_dependants.put("jar:file:/D:/ProjectC/Server%20HHT/BARGE-OPERATION/SERVER-WS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BargeOperation/WEB-INF/lib/spring-webmvc-4.0.6.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1404739798000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar-inner\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t</a> <a class=\"brand\" href=\"#\">Admin Panel</a>\r\n");
      out.write("\t\t<div class=\"nav-collapse collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" role=\"button\"\r\n");
      out.write("\t\t\t\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-user\"></i> Vincent Gabriel <i class=\"caret\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a tabindex=\"-1\" href=\"#\">Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a tabindex=\"-1\" href=\"login.html\">Logout</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"#\">Dashboard</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\tclass=\"dropdown-toggle\">Configuration <b class=\"caret\"></b>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\" id=\"menu11\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"QuayCrane\">Quay Crane</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\tclass=\"dropdown-toggle\">Master <b class=\"caret\"></b>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\" id=\"menu11\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listVesselBargeInfo.html\">Vessel Barge Info\r\n");
      out.write("\t\t\t\t\t\t\t\tList</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">Partner Info List</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listCargoInfo\">Cargo Info List</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\tclass=\"dropdown-toggle\">Voyage <b class=\"caret\"></b>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\" id=\"menu11\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listVoyageCargoInfo\">Voyage Cargo Info List</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listVoyageBLInfo\">Voyage BL Info List</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listVoyageHoldInfo\">Voyage Hold Info List</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listVoyageBargeOperation\">Voyage Barge\r\n");
      out.write("\t\t\t\t\t\t\t\tOperation List</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\tclass=\"dropdown-toggle\">Manual <b class=\"caret\"></b>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\" id=\"menu11\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"listManualBargeOperation\">Manual Barge\r\n");
      out.write("\t\t\t\t\t\t\t\tOperation List</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" role=\"button\"\r\n");
      out.write("\t\t\t\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\">Users <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"caret\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a tabindex=\"-1\" href=\"#\">User List</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a tabindex=\"-1\" href=\"#\">Search</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a tabindex=\"-1\" href=\"#\">Permissions</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--/.nav-collapse -->\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/common/topmenu.jsp(43,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/PartnerInfo/list");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
