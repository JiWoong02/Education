<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="views/common/error.jsp"
	import="member.model.dto.User"%>
<%
User loginUser = (User) session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>first</title>
<style>
div.lineA {
	height: 100px;
	border: 1px solid gray;
	float: left;
	position: relative;
	left: 120px;
	margin: 5px;
	padding: 5px;
}

div#banner {
	width: 500px;
	padding: 0px;
}

div#banner img {
	width: 450px;
	height: 80px;
	padding: 0;
	margin-top: 10px;
}

div#loginBox {
	width: 280px;
	font-size: 10pt;
	text-align: left;
	padding-left: 20px;
}

div#loginBox button {
	width: 250px;
	height: 35px;
	background-color: navy;
	color: white;
	margin-top: 10px;
	margin-bottom: 15px;
	font-size: 14pt;
	font-weight: bold;
}

table#toplist td, table#newnotice td {
	text-align: center;
}
</style>
<!-- jQuery 코드 불러옴 -->
<script type="text/javascript" src="/first/resources/js/jquery-3.7.1.min.js"></script>

<script type="text/javascript">
	//자바스크립트로 페이지 연결 또는 서블릿 컨트롤러 연결 요청시에는
	//location 객체의 href 속성을 사용함 => 상대, 절대경로 둘 다 사용가능
	function movePage() {
		location.href = "/first/views/member/loginPage.html"
	};
	
//jquery document ready ---------------------------------------------------
$(function(){
		//최근 등록된 공지사항 글 3개 전송받아서 출력 처리
		//setInterval(function(){
		$.ajax({
			url: "/first/ntop3",
			type: "get",
			dataType : "json",
			success: function(data){//요청이 성공했을 때
				console.log("success : " + data);
				
				//object --> string
				var str = JSON.stringify(data);  //=> object를 string 형태로 바꿈
				
				//string --> json
				var json = JSON.parse(str);
				
				values = "";
				for(var i in json.nlist){	//decodeURIComponent(json.nlist[i].title)
					values += "<tr><td>" + json.nlist[i].no + "</td><td>" 
									+ decodeURIComponent(json.nlist[i].title).replace(/\+/gi, " ") +"</td><td>" 
									+ json.nlist[i].date + "</td></tr>";
				}
				
				$('#newnotice').html($('#newnotice').html()+values);
			},
			error: function(jqXHR, textStatus, errorThrown ){// 요청이 실패했을 때
				console.log("error : " + jqXHR + ", " + textStatus + ", " + errorThrown)
			}
		});
		$.ajax({
			url: "/first/btop3",
			type: "get",
			dataType : "json",
			success: function(data){//요청이 성공했을 때
				console.log("success : " + data);
				
				//object --> string
				var str = JSON.stringify(data);  //=> object를 string 형태로 바꿈
				
				//string --> json
				var json = JSON.parse(str);
				
				values = "";
				for(var i in json.blist){	//decodeURIComponent(json.nlist[i].title)
					values += "<tr><td>" + json.blist[i].bnum + "</td><td>" 
									+ decodeURIComponent(json.blist[i].btitle).replace(/\+/gi, " ") +"</td><td>" 
									+ json.blist[i].rcount + "</td></tr>";
				}
				
				$('#toplist').html($('#toplist').html()+values);
			},
			error: function(jqXHR, textStatus, errorThrown ){// 요청이 실패했을 때
				console.log("error : " + jqXHR + ", " + textStatus + ", " + errorThrown)
			}
		});
		
		// }, 1000*60*3) $.ajax() close  //setInterval(함수, 밀리초);
/* 		$.ajax({
			  accepts: {
			    mycustomtype: 'application/x-some-custom-type'
			  },
			 
			  // Instructions for how to deserialize a `mycustomtype`
			  converters: {
			    'text mycustomtype': function(result) {
			      // Do Stuff
			      return newresult;
			    }
			  },
			 
			  // Expect a `mycustomtype` back from server
			  dataType: 'mycustomtype'
			}); */
		
});	//document ready

</script>
</head>
<body>
	<h1>firstWebProject : first</h1>
	<hr>
	<header>
		<div id="banner" class="lineA">
			<img src="/first/resources/images/photo2.jpg">
		</div>
		<%-- 로그인 하지 않은 상태일 때 --%>
		<%
		if (loginUser == null) {
		%>
		<div id="loginBox" class="lineA">
			first 사이트 방문을 환영합니다.<br>
			<button onclick="movePage();">로그인 하세요.</button>
			<br> <a href="/first/views/member/enrollPage.html">회원가입</a>
			<%-- 회원가입 클릭하면 회원가입페이지가 연결되어 출력되게 링크 설정함 --%>
		</div>
		<%} else {	//로그인했을 때%>
			<div id="loginBox" class="lineA">
				<%= loginUser.getUserName() %> 님 &nbsp; <a href="/first/logout">로그아웃</a><br>
			</div>
		<%
		}	//else
		%>

	</header>
	<hr style="clear: both;">
	<section>
		<%-- 최근 등록된 공지사항 글 3개 출력 : ajax --%>
		<div style="float:left; border:1px solid navy; padding: 5px; margin:5px; margin-left:150px">
				<h4>새로운 공지사항</h4>
				<table id="newnotice" border= "1" cellspacing="0" width="350">
					<tr><th>번호</th><th>제목</th><th>날짜</th></th>
				</table>
		</div>
		
		<%-- 조회수 많은 인기 게시글 3개 출력 : ajax --%>
		<div style="float:left; border:1px solid navy; padding: 5px; margin:5px; margin-left:50px">
				<h4>인기 게시물</h4>
				<table id="toplist" border= "1" cellspacing="0" width="350">
					<tr><th>번호</th><th>제목</th><th>조회수</th></th>
				</table>
		</div>		
	</section>
	<hr style="clear: both;">
	<%-- jsp 주석태그 --%>
	<%-- jsp 파일 안에 외부에서 별도로 작성된 jsp, html 파일을 불러다 포함시켜 보여지게 할 수 있음 
		주의 : 상대경로만 사용할 수 있음
		외부 파일불러다 쓸 때는 지시자 태그 @include
		세개의 지시자 속성 있음page, include, taglib--%>
	<%@include file="views/common/footer.jsp"%>
</body>
</html>