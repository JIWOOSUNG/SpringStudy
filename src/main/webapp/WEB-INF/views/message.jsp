<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
<<<<<<< HEAD
        <title>main</title>
    </head>
    <body>
        <h1> 반가워요 - message.jsp </h1>
=======
        <title></title>
    </head>
    <body>
        <c:if test="${msg !=null}">
            <script>
                alert("${msg}");
                location.href="${loc}";
            </script>
        </c:if>
>>>>>>> ce81260 (- Spring MVC 아키텍처 (화면계층/컨트롤러/서비스/영속성계층))
    </body>
</html>