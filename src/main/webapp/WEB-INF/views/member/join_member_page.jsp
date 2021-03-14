<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 회원 가입 </h1>
	<form action="./join_member_process.do" method="post">
	ID :  <input type="text" name="member_id"><br>
	PW :  <input type="password" name="member_pw"><br>
	이름 : <input type="text" name="member_name"><br>
	성별 : <input type="radio" name="member_gender" value="M" checked>남
	      <input type="radio" name="member_gender" value="F">여<br>
	<input type="submit" value="가입">
	</form>

</body>
</html>