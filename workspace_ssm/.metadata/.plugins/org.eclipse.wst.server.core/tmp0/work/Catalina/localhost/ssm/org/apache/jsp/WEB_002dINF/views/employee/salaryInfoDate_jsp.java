/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-04-09 00:47:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class salaryInfoDate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/workspace_ssm/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ssm/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/workspace_ssm/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ssm/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1711624598000L));
    _jspx_dependants.put("jar:file:/D:/workspace_ssm/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ssm/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>직원 급여 정보 등록, 수정 및 삭제</title>\r\n");
      out.write("<style>\r\n");
      out.write("    body {\r\n");
      out.write("        font-family: 'Arial', sans-serif;\r\n");
      out.write("        background-color: #f4f4f4;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        color: #333;\r\n");
      out.write("    }\r\n");
      out.write("    h2, h4 {\r\n");
      out.write("        color: #444;\r\n");
      out.write("    }\r\n");
      out.write("    form {\r\n");
      out.write("        background: #fff;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        border-radius: 8px;\r\n");
      out.write("        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    }\r\n");
      out.write("    label {\r\n");
      out.write("        display: block;\r\n");
      out.write("        margin-top: 20px;\r\n");
      out.write("        margin-bottom: 5px;\r\n");
      out.write("    }\r\n");
      out.write("    input[type=\"number\"], input[type=\"text\"], input[type=\"submit\"] {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        margin-bottom: 20px;\r\n");
      out.write("        border-radius: 5px;\r\n");
      out.write("        border: 1px solid #ddd;\r\n");
      out.write("        box-sizing: border-box; /* Makes sure padding does not affect total width */\r\n");
      out.write("    }\r\n");
      out.write("    input[type=\"submit\"] {\r\n");
      out.write("        background-color: #5cb85c;\r\n");
      out.write("        color: white;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("    input[type=\"submit\"]:hover {\r\n");
      out.write("        background-color: #4cae4c;\r\n");
      out.write("    }\r\n");
      out.write("    .accordionMenu div {\r\n");
      out.write("		font-size:15px;\r\n");
      out.write("		display:block;\r\n");
      out.write("		font-weight:normal;\r\n");
      out.write("		color:#424242;\r\n");
      out.write("		text-shadow:2px 2px 2px #aeaeae;\r\n");
      out.write("		text-decoration:none;\r\n");
      out.write("		margin:0;\r\n");
      out.write("		padding:10px;\r\n");
      out.write("		background:#8f8f8f;\r\n");
      out.write("	}\r\n");
      out.write("	.accordionMenu form {\r\n");
      out.write("		padding:0 10px;\r\n");
      out.write("		margin:0;\r\n");
      out.write("		height:0;\r\n");
      out.write("		overflow:hidden;\r\n");
      out.write("		-moz-transition:height 0.5s ease-in;\r\n");
      out.write("		-webkit-transition:height 0.5s ease-in;\r\n");
      out.write("		-o-transition:height 0.5s ease-in;\r\n");
      out.write("		transition:height 0.5s ease-in;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"insertSalaryForm\">\r\n");
      out.write("    <h2>직원 금융 정보 등록</h2>\r\n");
      out.write("    <!-- 등록 폼 -->\r\n");
      out.write("<form id=\"insertSalary\" action=\"insertSalary.do\" method=\"post\">\r\n");
      out.write("    <!-- 입력 필드들 -->\r\n");
      out.write("    <label for=\"empId\">직원 번호:</label> \r\n");
      out.write("    <input type=\"number\" id=\"empId\" name=\"empId\" min=\"1\" required><br>\r\n");
      out.write("     \r\n");
      out.write("    <label for=\"bankName\">은행 이름:</label> \r\n");
      out.write("    <input type=\"text\" id=\"bankName\" name=\"bankName\" required><br>\r\n");
      out.write("    \r\n");
      out.write("    <label for=\"bankAccountNo\">계좌 번호:</label> \r\n");
      out.write("    <input type=\"text\" id=\"bankAccountNo\" name=\"bankAccountNo\" required><br>\r\n");
      out.write("     \r\n");
      out.write("    <label for=\"accountHolder\">계좌 소유자 이름:</label>\r\n");
      out.write("    <input type=\"text\" id=\"accountHolder\" name=\"accountHolder\" required><br>\r\n");
      out.write("     \r\n");
      out.write("    <label for=\"premium\">보험료:</label>\r\n");
      out.write("    <input type=\"text\" id=\"premium\" name=\"premium\" required><br> \r\n");
      out.write("     \r\n");
      out.write("    <label for=\"tax\">세금:</label>            \r\n");
      out.write("    <input type=\"text\" id=\"tax\" name=\"tax\" required><br> \r\n");
      out.write("    \r\n");
      out.write("    <input type=\"submit\" value=\"등록\"> <br> \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</div>  \r\n");
      out.write("<div id=\"updateSalaryForm\">\r\n");
      out.write("    <!-- 직원 급여정보 수정 -->\r\n");
      out.write("    <h2>직원 급여 정보 수정</h2>\r\n");
      out.write("      <form action=\"updateSalary.do\" method=\"post\">\r\n");
      out.write("        <label for=\"empId\">직원 번호:</label>\r\n");
      out.write("        <input type=\"number\" id=\"empId\" name=\"empId\" min=\"1\" required><br>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"bankName\">은행 이름:</label> \r\n");
      out.write("        <input type=\"text\" id=\"bankName\" name=\"bankName\" required><br>\r\n");
      out.write("    \r\n");
      out.write("        <label for=\"bankAccountNo\">계좌 번호:</label>\r\n");
      out.write("        <input type=\"text\" id=\"bankAccountNo\" name=\"bankAccountNo\" required><br>\r\n");
      out.write("    \r\n");
      out.write("        <label for=\"accountHolder\">계좌 소유자 이름:</label>\r\n");
      out.write("        <input type=\"text\" id=\"accountHolder\" name=\"accountHolder\" required><br>\r\n");
      out.write("    \r\n");
      out.write("        <label for=\"premium\">보험료:</label>\r\n");
      out.write("        <input type=\"number\" id=\"premium\" name=\"premium\" required><br>\r\n");
      out.write("    \r\n");
      out.write("        <label for=\"tax\">세금:</label>\r\n");
      out.write("        <input type=\"number\" id=\"tax\" name=\"tax\" required><br>\r\n");
      out.write("    \r\n");
      out.write("        <input type=\"submit\" value=\"수정\">\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("<div id=\"deleteSalaryForm\">\r\n");
      out.write("    <!-- 직원 급여정보 삭제 -->\r\n");
      out.write("    <h4>직원 급여 정보 삭제</h4>\r\n");
      out.write("    <form action=\"deleteSalary.do\" method=\"post\">\r\n");
      out.write("         직원 번호: <input type=\"text\" name=\"empId\" required><br>\r\n");
      out.write("        직원 이름: <input type=\"text\" name=\"empName\" required><br>\r\n");
      out.write("        <input type=\"submit\" value=\"삭제\" onclick=\"return confirm('정말 삭제하시겠습니까?');\">\r\n");
      out.write("    </form>\r\n");
      out.write("</div>  \r\n");
      out.write("<!-- 목록으로 돌아가기 버튼 -->\r\n");
      out.write("<button onclick=\"location.href='mainEmpPage.do'\">목록으로 돌아가기</button>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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