/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2021-01-11 10:45:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.project_3.util.HTMLUtility;
import in.co.rays.project_3.util.DataUtility;
import in.co.rays.project_3.dto.MarksheetDTO;
import java.util.Iterator;
import java.util.List;
import in.co.rays.project_3.util.ServletUtility;
import in.co.rays.project_3.ctl.MarksheetListCtl;
import in.co.rays.project_3.ctl.LoginCtl;
import in.co.rays.project_3.dto.RoleDTO;
import in.co.rays.project_3.dto.UserDTO;
import in.co.rays.project_3.ctl.ORSView;

public final class MarksheetListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1606982788534L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1610356007564L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("in.co.rays.project_3.util.HTMLUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.MarksheetDTO");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("in.co.rays.project_3.ctl.MarksheetListCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.util.ServletUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.ctl.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.RoleDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.ctl.ORSView");
    _jspx_imports_classes.add("in.co.rays.project_3.util.DataUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.UserDTO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Marksheet List view</title>\r\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/CheckBox11.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".p1 {\r\n");
      out.write("\tpadding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hm-gradient {\r\n");
      out.write("\tbackground-image: url('");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/bg1.png');\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hm-gradient\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("<title>Header</title>\r\n");
      out.write("<title>jQuery UI Datepicker - Display month &amp; year menus</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("  \r\n");
      out.write("  var d = new Date();\r\n");
      out.write("  function disableSunday(d){\r\n");
      out.write("  \t  var day = d.getDay();\r\n");
      out.write("  \t  if(day==0)\r\n");
      out.write("  \t  {\r\n");
      out.write("  \t   return [false];\r\n");
      out.write("  \t  }else\r\n");
      out.write("  \t  {\r\n");
      out.write("  \t\t  return [true];\r\n");
      out.write("  \t  }\r\n");
      out.write("  }\r\n");
      out.write("  $( function() {\r\n");
      out.write("    $( \"#datepicker\" ).datepicker({\r\n");
      out.write("      changeMonth: true,\r\n");
      out.write("      changeYear: true,\r\n");
      out.write("      yearRange : '1970:2030',\r\n");
      out.write("      dateFormat:'dd/mm/yyyy'\r\n");
      out.write("     \r\n");
      out.write("    });\r\n");
      out.write("  } );\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\"\r\n");
      out.write("\tintegrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
 UserDTO userDto=(UserDTO)session.getAttribute("user");
	
		boolean userLoggedIn=userDto!=null;
		
		String welcomeMsg="Hi, ";
		if(userLoggedIn){
			String role=(String)session.getAttribute("role");
			welcomeMsg+=userDto.getFirstName() + "("+role+")";
		}else{
			welcomeMsg+="Guest";
		}
	
	
      out.write("\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\"> \r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\"><img\r\n");
      out.write("\t\t\tsrc=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/custom.png\" width=\"90px\"\r\n");
      out.write("\t\t\theight=\"40px\"></a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#navbarNav\" aria-controls=\"navbarNav\"\r\n");
      out.write("\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t<a class=\"nav-link\" href=\"#\"> <span class=\"sr-only\">(current)</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t");

					if (userLoggedIn) {
				
      out.write("\r\n");
      out.write("\t\t\t\t");

					if (userDto.getRoleId() == RoleDTO.STUDENT) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t<a\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Marksheet</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"\tfar fa-file-alt\"></i>Marksheet Merit List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t<a\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">User</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t<li><a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fas fa-user-tie\"></i>My Profile</a> \r\n");
      out.write("\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><i class=\"\tfar fa-file-alt\"></i>Change Password</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t");

					} else if (userDto.getRoleId() == RoleDTO.ADMIN) {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 20px;\">\r\n");
      out.write("\t\t\t\t<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">User</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-user-circle\"></i>Add User</a> \r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-friends\"></i>User List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 20px\">\r\n");
      out.write("\t\t\t\t<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Marksheet</font></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"far fa-file\"></i>Add Marksheet</a> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-paste\"></i>Marksheet List</a> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"\tfar fa-file-alt\"></i>Marksheet Merit List </a> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-paste\"></i>Get Marksheet</a>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 20px\">\r\n");
      out.write("\t\t\t\t<a\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Role</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa\t fa-user-tie\"></i>Add Role</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i\tclass=\"fas fa-user-friends\"></i>Role List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 20px\">\r\n");
      out.write("\t\t\t\t<a\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">College</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-university\"></i>Add College</a> \r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-building\"></i>College List </a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 20px\">\r\n");
      out.write("\t\t\t\t<a\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Course\r\n");
      out.write("\t\t\t\t\t</font></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-book-open\"></i>Add Course</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-sort-amount-down\"></i>Course List </a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 20px\">\r\n");
      out.write("\t\t\t\t<a\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Student</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"far fa-user-circle\"></i>Add Student</a> \r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-users\"></i>Student List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 20px\">\r\n");
      out.write("\t\t\t\t<a\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Faculty\r\n");
      out.write("\t\t\t\t\t</font></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t  <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t  <i class=\"fas fa-user-tie\"></i>Add Faculty</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><i class=\"\tfas fa-users\"></i>Faculty List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 20px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Time\r\n");
      out.write("\t\t\t\t\t\t\tTable</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-clock\"></i>Add TimeTable</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-clock\"></i>TimeTable List</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 20px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Subject</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-calculator\"></i>Add Subject</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sort-amount-down\"></i>Subject List\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					}
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"\r\n");
      out.write("\t\t\t\t\tstyle=\"padding-left: 20px; padding-right: 67px\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"><font style=\"color: white;\">");
      out.print(welcomeMsg);
      out.write("\r\n");
      out.write("\t\t\t\t\t</font></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t");

							if (userLoggedIn) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sign-out-alt\"></i>Logout </a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fas fa-user-tie\"></i>My\r\n");
      out.write("\t\t\t\t\t\t\tProfile</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-edit\"></i>Change Password\r\n");
      out.write("\t\t\t\t\t\t</a> <a class=\"dropdown-item\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-clone\"></i>Java Doc </a>\r\n");
      out.write("\t\t\t\t\t\t");

							} else {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sign-in-alt\">Login</i> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.USER_REGISTRATION_CTL);
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fas fa-registered\"></i> User Registration</a> ");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<form action=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      in.co.rays.project_3.dto.MarksheetDTO dto = null;
      dto = (in.co.rays.project_3.dto.MarksheetDTO) _jspx_page_context.getAttribute("dto", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (dto == null){
        dto = new in.co.rays.project_3.dto.MarksheetDTO();
        _jspx_page_context.setAttribute("dto", dto, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\t\t\t");

				List list1 = (List) request.getAttribute("RollNo");
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				int pageNo = ServletUtility.getPageNo(request);
				int pageSize = ServletUtility.getPageSize(request);
				int index = ((pageNo - 1) * pageSize) + 1;
				int nextPageSize = DataUtility.getInt(request.getAttribute("nextListSize").toString());
				List list = ServletUtility.getList(request);
				Iterator<MarksheetDTO> it = list.iterator();
				if (list.size() != 0) {
			
      out.write("\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t\t<h1 style=\"font-size: 40px; padding-top: 24px; color: #162390;\">Marksheet\r\n");
      out.write("\t\t\t\t\tList</h1>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</br>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					if (!ServletUtility.getSuccessMessage(request).equals("")) {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 alert alert-success alert-dismissible\" style=\"background-color: #80ff80\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("\t\t\t\t\t<h4><font color=\"#008000\">");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font></h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					if (!ServletUtility.getErrorMessage(request).equals("")) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\" col-md-4 alert alert-danger alert-dismissible\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t<font color=\"red\">");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font></h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-3\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"name\" placeholder=\"Enter name\" class=\"p1\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(ServletUtility.getParameter("name", request));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-2\">");
      out.print(HTMLUtility.getList("RollNo", String.valueOf(dto.getId()), list1));
      out.write("</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"btn btn-primary btn-md\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"font-size: 17px\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(MarksheetListCtl.OP_SEARCH);
      out.write("\">&emsp; <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"submit\" class=\"btn btn-warning btn-md\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"font-size: 17px\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(MarksheetListCtl.OP_RESET);
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-3\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</br>\r\n");
      out.write("\t\t\t<div style=\"margin-bottom: 20px;\" class=\"table-responsive\">\r\n");
      out.write("\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr style=\"background-color: #f2c12dcc;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"10%\"><input type=\"checkbox\" id=\"select_all\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"Select\" class=\"text\"> Select All</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">S.NO</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">RollNo</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">Physics</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">Chemistry</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">Maths</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text\">Edit</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t");

						while (it.hasNext()) {
								dto = it.next();
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td ><input type=\"checkbox\" class=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"ids\" value=\"");
      out.print(dto.getId());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td >");
      out.print(index++);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td >");
      out.print(dto.getRollNo());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td >");
      out.print(dto.getName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td >");
      out.print(dto.getPhysics());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td >");
      out.print(dto.getChemistry());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td >");
      out.print(dto.getMaths());
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"MarksheetCtl?id=");
      out.print(dto.getId());
      out.write("\">Edit</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<table width=\"100%\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-primary btn-md\" style=\"font-size: 17px\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(MarksheetListCtl.OP_PREVIOUS);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(pageNo > 1 ? "" : "disabled");
      out.write("></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-primary btn-md\" style=\"font-size: 17px\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(MarksheetListCtl.OP_NEW);
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-primary btn-md\" style=\"font-size: 17px\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(MarksheetListCtl.OP_DELETE);
      out.write("\"></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td align=\"right\"><input type=\"submit\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-primary btn-md\" style=\"font-size: 17px\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"padding: 5px;\" value=\"");
      out.print(MarksheetListCtl.OP_NEXT);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t");
      out.print((nextPageSize != 0) ? "" : "disabled");
      out.write("></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				}
				if (list.size() == 0) {
					System.out.println("user list view list.size==0");
			
      out.write("\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t\t<h1 style=\"font-size: 40px; padding-top: 24px; color: #162390;\">Marksheet\r\n");
      out.write("\t\t\t\t\tList</h1>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\t\t\t</br>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					if (!ServletUtility.getErrorMessage(request).equals("")) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\" col-md-4 alert alert-danger alert-dismissible\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t<font color=\"red\">");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font></h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</br>\r\n");
      out.write("\t\t\t<div style=\"padding-left: 48%;\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"operation\" class=\"btn btn-primary btn-md\"\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size: 17px\" value=\"");
      out.print(MarksheetListCtl.OP_BACK);
      out.write("\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"pageNo\" value=\"");
      out.print(pageNo);
      out.write("\"> <input\r\n");
      out.write("\t\t\t\ttype=\"hidden\" name=\"pageSize\" value=\"");
      out.print(pageSize);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</br>\r\n");
      out.write("\t</br>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write("   position: fixed;\r\n");
      out.write("   left: 0;\r\n");
      out.write("   bottom: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   background-color: #484848;\r\n");
      out.write("   color: white;\r\n");
      out.write("   text-align: center;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<hr>\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<h5 style=\"color: white; margin-top: -28px;\">&#169; RAYS Technologies</h5></center>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
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
}
