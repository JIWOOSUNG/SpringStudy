<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <c:if test="${msg !=null}">
            <script>
                alert("${msg}");
                location.href="${loc}";
            </script>
        </c:if>
    </body>
</html>