<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>
    <div class="wrap">
            <h1 class="my-3">Post View</h1>

         <div class="text-center py-3">
            <a href="/posts/form">글쓰기</a>|<a href="/posts/list">글목록</a>
         </div>
        <c:if test="${dto == null}">
            <h3>해당 게시글은 없습니다</h3>
        </c:if>
        <c:if test="${dto != null}">
                <table class="table table-bordered">
                            <tr>
                                <td width="20%"><b>글번호</b></td>
                                <td width="30%">${dto.id}</td>
                                <td width="20%"><b>작성일</b></td>
                                 <td width="30%">
                                        <c:out value="${dto.wdate}" />
                                 </td>
                            </tr>
                            <tr>
                                <td width="20%"><b>글쓴이</b></td>
                                <td width="30%">
                                     <c:out value="${dto.name}" />
                                </td>
                                <td width="20%"><b>조회수</b></td>
                                 <td width="30%">
                                     <c:out value="${dto.readNum}" />
                                 </td>
                            </tr>
                            <tr>
                                <td width="20%"><b>첨부파일</b></td>
                                <td colspan="3">
                                <a href="#" download>
                                    <c:out value="${dto.originFileName}" />
                                </a>
                                    [<c:out value="${dto.fileSize}" />   bytes ]
                                </td>
                            </tr>
                            <tr>
                                <td width="20%"><b>제  목</b></td>
                                <td colspan="3">
                                    <c:out value="${dto.title}" />
                                </td>
                            </tr>
                            <tr>
                                <td width="20%"><b>글 내용</b></td>
                                <td colspan="3" id="content">
                                    <c:out value="${dto.content}" />
                                </td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align:center">
                                    <a href="/posts/form">글쓰기</a>
                                    | <a href="/posts/list">글목록</a>
                                    <!--로그인한 사람이 글을 쓴 사람이라면 -->

                                       | <a href="javascript:goEdit()">글수정</a> |
                                        <a href="javascript:goDel()">글삭제</a>

                                </td>
                            </tr>
                        </table>
                   </c:if>
        </div>
    </body>
</html>