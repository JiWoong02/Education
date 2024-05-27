<%--
  Created by IntelliJ IDEA.
  User: ict01-4
  Date: 2024-04-19
  Time: 오후 2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>board : 게시글 등록 페이지</h2>
    <form action="/boards" method="post">
        <label>글제목 :</label> <label>
        <input type="text" name="boardTitle">
    </label><br>
        <label>작성자 :</label> <label>
        <input type="text" name="boardWriter">
    </label><br>
        <label>내용 :</label> <label>
        <textarea name="boardContent" cols="50" rows="5" placeholder="내용을 입력해주세요!"></textarea>
    </label>
        <input type="submit" value="게시글등록">
    </form>
</body>
</html>
