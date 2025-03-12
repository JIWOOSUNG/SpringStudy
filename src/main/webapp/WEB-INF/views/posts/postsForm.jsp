<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
<<<<<<< HEAD
        <title>main</title>
        <link rel="stylesheet" type="text/css" href="/css/posts.css">
     </head>
=======
        <title></title>
        <link rel="stylesheet" type="text/css" href="/css/posts.css">
    </head>
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
    <body>
    <div class="wrap">
        <h1> Spring Posts</h1>
        <form name="pf" action="/posts/write" method="post">
        <!-- 파일 업로드 시 주의사항. method="post" enctype="multipart/form-data" -->
            <ul>
                <li>제목</li>
                <li><input type="text" name="title" id="title" placeholder="Title" required></li>

                <li>작성자</li>
                <li><input type="text" name="name" id="name" placeholder="Name" required></li>

                <li>글내용</li>
                <li><textarea rows="10" cols="50" name="content" id="content" placeholder="Content"></textarea></li>

                <li>첨부파일</li>
                <li><input type="file" name="mfileName" id="mfileName" placeholder="Attach File"></li>

                <li>비밀번호</li>
                <li><input type="password" name="pwd" id="pwd" placeholder="Password" required></li>
            </ul>
            <div class="clear"></div>
            <div class="text-center">
                <button class="btn btn-info">글쓰기</button>
                <button class="btn btn-warning" type="reset">다시쓰기</button>
            </div>
<<<<<<< HEAD
            </form>
            </div>
=======
        </form>
</div>
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
    </body>
</html>