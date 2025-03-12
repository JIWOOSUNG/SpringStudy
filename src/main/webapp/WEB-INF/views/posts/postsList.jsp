<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <h1 class="text-center my-3">Post List</h1>
        <div class="wrap">
            <div class="text-center py-3">
                <a href="/posts/form">글쓰기</a> | <a href="/posts/list">글목록</a>
            </div>
            <!-- 검색 form -------- -->
            <div class="py-3" id = "divFind">
                <form name="frm" action="list" onsubmit="return check()">
                    <select name="findType">
                        <option value="0">::검색유형::</option>
                        <option value="1">제  목</option>
                        <option value="2">작성자</option>
                        <option value="3">글내용</option>
                    </select>
                </form>
            </div>

            <!-- ----------- -->

             <ul id="posts">
                   <li>글번호</li>
                   <li>글제목</li>
                   <li>작성자</li>
                   <li>작성일</li>
                   <li>조회수</li>
                  <!-- ------- -->
                  <c:if test="${ list ==null || empty list }">
                    <li style="width:100%">
                        <b>데이터가 없습니다</b>
                    </li>
                  </c:if>
                  <c:if test="${list !=null && not empty list}">
                    <c:forEach var="dto" items="${list}">
                          <li>${dto.getId()}</li>
                          <li><a href="/posts/view?id=${dto.id}">${dto.getTitle()}</a></li>
                          <li>${dto.name}</li>
                          <li>
                            ${dto.wdate}
                            <!-- yy: 년도 MM: 월 dd: 일 HH:시(24시간) mm:분 ss: 초 -->
                          </li>
                          <li>${dto.readNum}</li>
                    </c:forEach>
                  </c:if>
             </ul>
             <div class="clear"></div>
             <div class="total">
                <span>총 게시글 수:   개</span>
                <span> 1 page / 3 pages</span>
             </div>
             <div class="pageNavi">
             </div>
        </div>
    </body>
</html>