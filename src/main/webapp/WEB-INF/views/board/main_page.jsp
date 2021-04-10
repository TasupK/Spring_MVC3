<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<meta name="viewport" content="width=device-width, initial-scale=1">

<title>[메인페이지]</title>
</head>
<body>
<c:choose>
	<c:when test="${!empty sessionUserData}">
		${sessionUserData.member_name}님 환영합니다.<br>
		<a href="${pageContext.request.contextPath}/member/logout_process.do" class="btn btn-secondary btn-sm">로그아웃</a>
		</c:when>
	<c:otherwise>
	비회원 접근 --- <a href="${pageContext.request.contextPath}/member/login.do" class="btn btn-primary btn-sm">로그인</a>
	</c:otherwise>
</c:choose>
<c:if test="${!empty sessionUserData}">
	<a href="${pageContext.request.contextPath}/board/write_content_page.do" class="btn btn-outline-dark btn-sm">글쓰기</a>
</c:if>

       
   <br>
   <table border="1" class="table table-dark table-striped">
   <tr>
     <td>글번호</td>
      <td>작성자</td>
     <td>제목</td>
     <td>작성일</td>
  </tr>
  <c:forEach items="${boardList}" var="boardInfoList">
    <tr>
      <td>${boardInfoList.boardVo.board_no} </td>
      <td>${boardInfoList.memberVo.member_name}</td>
      <td><a href="${pageContext.request.contextPath}/board/read_content_page.do?board_no=${boardInfoList.boardVo.board_no}">${boardInfoList.boardVo.board_title}</a></td>
      <td>${boardInfoList.boardVo.reg_date}</td>
     </tr>
  </c:forEach>
   </table>
   <br>   
</body>
</html>