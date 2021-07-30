<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link href="<c:url value='/static/css/loginForm.css'/>" rel="stylesheet" type="text/css" />
<link href="<c:url value='/static/css/footer.css'/>" rel="stylesheet" type="text/css" />
</head>
<body>
	<!-- 타이틀 -->
	<div id="topWrapper">
		<a href="javascript:history.back();"></a>
			<span>◁</span>뒤로가기
			<img src="/static/images/glk_i.png" />
			<a href="<c:url value='/'/>" class="logoImage" style="background-image: url('<c:url value="/static/images/glk_i.png"/>');">
			</a>
		
		<h2>
			회원가입
		</h2>
	</div>
	<!-- 타이틀 끝 -->
	<!-- 로그인 -->
	<div id="LoginWrapper">
		<div class="LoginDataWrap">
		</div>
	</div>
	<!-- 로그인 -->
	<div id="LoginWrapper">
		<div class="LoginDataWrap">
		
		<!-- 수정중---------------------------------------------------- -->
		
			<!-- 화면 바뀌게 -->
			<form action="/signUpAct" method="post" name="frm">
				<div class="idForm">
					<input type=text name="userId" id="userId" placeholder="ID를 입력하세요" />
				</div>
				<div class="passForm">
					<input type="password" name="userPw" id="userPw" placeholder="비밀번호를 입력하세요" />
				</div>
				<div class="nameForm">
					<input type=text name="userName" id="userName" placeholder="이름을 입력하세요" />
				</div>

				<!-- 에러 -->
				<div>
<%-- 					<form:errors path="userId"/>&nbsp; --%>
<%-- 					<form:errors path="userPw"/>&nbsp; --%>
				</div>
				<input type="submit" value="SIGN UP" class="loginButton" />
			</form>
		</div>
		<!-- 하단 나비 -->
		<div id="bottomWrapper">
			<ul>
				<li><a href="/login/signUp">Sign Up</a></li>
				<li><a href="/login/checkPh">Find ID</a></li>
				<li><a href="/login/checkId">Find Password</a></li>
			</ul>
		</div>
	</div>

	<!-- foot -->
	<footer> COPYRIGHT © 2019 GEMVAXLINK. ALL RIGHTS RESERVED. </footer>
	<!-- foot 끝 -->
</body>
</html>