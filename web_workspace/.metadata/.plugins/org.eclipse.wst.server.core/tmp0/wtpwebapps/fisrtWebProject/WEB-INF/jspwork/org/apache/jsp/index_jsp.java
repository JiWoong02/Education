/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-03-12 08:58:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.dto.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1709869693561L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.dto.User");
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
      			"views/common/error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

User loginUser = (User) session.getAttribute("loginUser");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>first</title>\r\n");
      out.write("<style>\r\n");
      out.write("div.lineA {\r\n");
      out.write("	height: 100px;\r\n");
      out.write("	border: 1px solid gray;\r\n");
      out.write("	float: left;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	left: 120px;\r\n");
      out.write("	margin: 5px;\r\n");
      out.write("	padding: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#banner {\r\n");
      out.write("	width: 500px;\r\n");
      out.write("	padding: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#banner img {\r\n");
      out.write("	width: 450px;\r\n");
      out.write("	height: 80px;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#loginBox {\r\n");
      out.write("	width: 280px;\r\n");
      out.write("	font-size: 10pt;\r\n");
      out.write("	text-align: left;\r\n");
      out.write("	padding-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#loginBox button {\r\n");
      out.write("	width: 250px;\r\n");
      out.write("	height: 35px;\r\n");
      out.write("	background-color: navy;\r\n");
      out.write("	color: white;\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("	margin-bottom: 15px;\r\n");
      out.write("	font-size: 14pt;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table#toplist td, table#newnotice td {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<!-- jQuery 코드 불러옴 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/first/resources/js/jquery-3.7.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	//자바스크립트로 페이지 연결 또는 서블릿 컨트롤러 연결 요청시에는\r\n");
      out.write("	//location 객체의 href 속성을 사용함 => 상대, 절대경로 둘 다 사용가능\r\n");
      out.write("	function movePage() {\r\n");
      out.write("		location.href = \"/first/views/member/loginPage.html\"\r\n");
      out.write("	};\r\n");
      out.write("	\r\n");
      out.write("//jquery document ready ---------------------------------------------------\r\n");
      out.write("$(function(){\r\n");
      out.write("		//최근 등록된 공지사항 글 3개 전송받아서 출력 처리\r\n");
      out.write("		//setInterval(function(){\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url: \"/first/ntop3\",\r\n");
      out.write("			type: \"get\",\r\n");
      out.write("			dataType : \"json\",\r\n");
      out.write("			success: function(data){//요청이 성공했을 때\r\n");
      out.write("				console.log(\"success : \" + data);\r\n");
      out.write("				\r\n");
      out.write("				//object --> string\r\n");
      out.write("				var str = JSON.stringify(data);  //=> object를 string 형태로 바꿈\r\n");
      out.write("				\r\n");
      out.write("				//string --> json\r\n");
      out.write("				var json = JSON.parse(str);\r\n");
      out.write("				\r\n");
      out.write("				values = \"\";\r\n");
      out.write("				for(var i in json.nlist){	//decodeURIComponent(json.nlist[i].title)\r\n");
      out.write("					values += \"<tr><td>\" + json.nlist[i].no + \"</td><td>\" \r\n");
      out.write("									+ decodeURIComponent(json.nlist[i].title).replace(/\\+/gi, \" \") +\"</td><td>\" \r\n");
      out.write("									+ json.nlist[i].date + \"</td></tr>\";\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				$('#newnotice').html($('#newnotice').html()+values);\r\n");
      out.write("			},\r\n");
      out.write("			error: function(jqXHR, textStatus, errorThrown ){// 요청이 실패했을 때\r\n");
      out.write("				console.log(\"error : \" + jqXHR + \", \" + textStatus + \", \" + errorThrown)\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url: \"/first/btop3\",\r\n");
      out.write("			type: \"get\",\r\n");
      out.write("			dataType : \"json\",\r\n");
      out.write("			success: function(data){//요청이 성공했을 때\r\n");
      out.write("				console.log(\"success : \" + data);\r\n");
      out.write("				\r\n");
      out.write("				//object --> string\r\n");
      out.write("				var str = JSON.stringify(data);  //=> object를 string 형태로 바꿈\r\n");
      out.write("				\r\n");
      out.write("				//string --> json\r\n");
      out.write("				var json = JSON.parse(str);\r\n");
      out.write("				\r\n");
      out.write("				values = \"\";\r\n");
      out.write("				for(var i in json.nlist){	//decodeURIComponent(json.nlist[i].title)\r\n");
      out.write("					values += \"<tr><td>\" + json.blist[i].bnum + \"</td><td>\" \r\n");
      out.write("									+ decodeURIComponent(json.blist[i].btitle).replace(/\\+/gi, \" \") +\"</td><td>\" \r\n");
      out.write("									+ json.blist[i].rcount + \"</td></tr>\";\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				$('#toplist').html($('#toplist').html()+values);\r\n");
      out.write("			},\r\n");
      out.write("			error: function(jqXHR, textStatus, errorThrown ){// 요청이 실패했을 때\r\n");
      out.write("				console.log(\"error : \" + jqXHR + \", \" + textStatus + \", \" + errorThrown)\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// }, 1000*60*3) $.ajax() close  //setInterval(함수, 밀리초);\r\n");
      out.write("/* 		$.ajax({\r\n");
      out.write("			  accepts: {\r\n");
      out.write("			    mycustomtype: 'application/x-some-custom-type'\r\n");
      out.write("			  },\r\n");
      out.write("			 \r\n");
      out.write("			  // Instructions for how to deserialize a `mycustomtype`\r\n");
      out.write("			  converters: {\r\n");
      out.write("			    'text mycustomtype': function(result) {\r\n");
      out.write("			      // Do Stuff\r\n");
      out.write("			      return newresult;\r\n");
      out.write("			    }\r\n");
      out.write("			  },\r\n");
      out.write("			 \r\n");
      out.write("			  // Expect a `mycustomtype` back from server\r\n");
      out.write("			  dataType: 'mycustomtype'\r\n");
      out.write("			}); */\r\n");
      out.write("		\r\n");
      out.write("});	//document ready\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>firstWebProject : first</h1>\r\n");
      out.write("	<hr>\r\n");
      out.write("	<header>\r\n");
      out.write("		<div id=\"banner\" class=\"lineA\">\r\n");
      out.write("			<img src=\"/first/resources/images/photo2.jpg\">\r\n");
      out.write("		</div>\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("		");

		if (loginUser == null) {
		
      out.write("\r\n");
      out.write("		<div id=\"loginBox\" class=\"lineA\">\r\n");
      out.write("			first 사이트 방문을 환영합니다.<br>\r\n");
      out.write("			<button onclick=\"movePage();\">로그인 하세요.</button>\r\n");
      out.write("			<br> <a href=\"/first/views/member/enrollPage.html\">회원가입</a>\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		");
} else {	//로그인했을 때
      out.write("\r\n");
      out.write("			<div id=\"loginBox\" class=\"lineA\">\r\n");
      out.write("				");
      out.print( loginUser.getUserName() );
      out.write(" 님 &nbsp; <a href=\"/first/logout\">로그아웃</a><br>\r\n");
      out.write("			</div>\r\n");
      out.write("		");

		}	//else
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</header>\r\n");
      out.write("	<hr style=\"clear: both;\">\r\n");
      out.write("	<section>\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("		<div style=\"float:left; border:1px solid navy; padding: 5px; margin:5px; margin-left:150px\">\r\n");
      out.write("				<h4>새로운 공지사항</h4>\r\n");
      out.write("				<table id=\"newnotice\" border= \"1\" cellspacing=\"0\" width=\"350\">\r\n");
      out.write("					<tr><th>번호</th><th>제목</th><th>날짜</th></th>\r\n");
      out.write("				</table>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("		<div style=\"float:left; border:1px solid navy; padding: 5px; margin:5px; margin-left:50px\">\r\n");
      out.write("				<h4>인기 게시물</h4>\r\n");
      out.write("				<table id=\"toplist\" border= \"1\" cellspacing=\"0\" width=\"350\">\r\n");
      out.write("					<tr><th>번호</th><th>제목</th><th>조회수</th></th>\r\n");
      out.write("				</table>\r\n");
      out.write("		</div>		\r\n");
      out.write("	</section>\r\n");
      out.write("	<hr style=\"clear: both;\">\r\n");
      out.write("	");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<style>\r\n");
      out.write("footer{\r\n");
      out.write("	text-align : center;\r\n");
      out.write("	background-color : navy;\r\n");
      out.write("	color : white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer>\r\n");
      out.write("copyright@ict.org &nbsp; 클라우드 AI 도우미 서비스 개발자 과정 <br>\r\n");
      out.write("서울시 서초구 신논현동 ICT기술협회 강남지원, TEL : 02-1234-5678, FAX : 02-1234-5678\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
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
