<%--
  Created by IntelliJ IDEA.
  User: ict01-4
  Date: 2024-04-19
  Time: 오후 4:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>detailView</title>
    <script type="text/javascript" src="/resources/js/jquery-3.7.0.min.js"></script>
    <script type="text/javascript">
    $(function (){
        $('#deleteBtn').on('click', function (){
            var bno = '${ board.boardNum}';
            $.ajax({
                type:"DELETE",
                url:"/boards/"+bno,
                contentType: "application/json; charset=UTF-8",
                success: function (){
                    location.href =  '/';
                },
                error: function (xhr, status, error){
                    alert("code : " + xhr.status + "\n" + "message : " + xhr.responseText + "\n" + "error : " + error);
                }
            })
        })
    });
    $(function (){
        $('#modifyBtn').on('click', function (){
            var boardObject = {
                boardNum : ${board.boardNum},
                boardTitle : $('input[name=boardTitle]').val(),
                boardContent : $('textarea').val()
            }

            var bno = '${ board.boardNum}';

            $.ajax({
                type:"PUT",
                url:"/boards/"+bno,
                data: JSON.stringify(boardObject),
                contentType: "application/json; charset=UTF-8",
                success: function (){
                    location.href =  '/';
                },
                error: function (xhr, status, error){
                    alert("code : " + xhr.status + "\n" + "message : " + xhr.responseText + "\n" + "error : " + error);
                }
            })
        })
    });
    </script>
</head>
<body>
    <h2>${board.boardNum} 번 게시글 내용 보기 및 수정 페이지</h2>
    <form action="/boards" method="post">   <!-- form 의 전송방식은 GET | POST 만 가능함-->
        <input type="hidden" name="boardNum" value="${board.boardNum}">
        <label>글제목 :</label> <label>
        <input type="text" name="boardTitle" value="${board.boardTitle}">
    </label><br>
        <label>작성자 :</label> <label>
        <input type="text" name="boardWriter" readonly value="${board.boardWriter}">
    </label><br>
        <label>내용 :</label> <label>
        <textarea name="boardContent" cols="50" rows="5" placeholder="내용을 입력해주세요!">${board.boardContent}</textarea>
    </label>
        <input id="modifyBtn" type="button" value="게시글수정">
    </form>
   <br>
    <button id="deleteBtn">게시글 삭제</button>
</body>
</html>
