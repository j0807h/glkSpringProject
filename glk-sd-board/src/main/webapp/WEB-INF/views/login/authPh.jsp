<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value='/static/css/top.css'/>" rel="stylesheet" type="text/css" />
<link href="<c:url value='/static/css/loginForm.css'/>" rel="stylesheet" type="text/css" />
<link href="<c:url value='/static/css/footer.css'/>" rel="stylesheet" type="text/css" />
<!-- <link rel="stylesheet"	href="https://use.fontawesome.com/releases/v5.15.2/css/all.css" /> -->
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="<c:url value='/js/jquery.form.js'/>"></script>
</head>
<body>
	<!-- top -->
		<%@ include file = "../main/top.jsp" %>
	<!-- top 끝-->
	<!-- 타이틀 -->
	<div id="topWrapper">
		<a href="javascript:history.back();">
			<span>◁</span>뒤로가기
		</a>
		<h2>
			비밀번호 찾기
		</h2>
	</div>
	<div id="LoginWrapper">
		<div class="description">
			<span class="title">비밀번호가 기억나지 않아 답답하셨나요?</span>
			<span>${userId }님, 연락처를 입력하시면 비밀번호를 찾을 수 있어요!</span>
		</div>
		<div class="LoginDataWrap">
			<form action="newPw" method="post" name="frm"  >
				<input type="hidden" name="userId" value="${userId }"/>
				<div class="idForm">
					<input type="text" name="userPh" id="userPh" placeholder="010-1234-5678" />
				</div>
				<div class="passForm">
					<input type="text" name="checkNum" id="checkNum" placeholder="인증번호 입력" onkeyup="isCorrect();"/>
				</div>
				<div>
					<span id="error"></span>
				</div>
				<input type="button" value="인증번호 전송" class="loginButton" onclick="return sendPh(this);" />
				<input type="submit" value="비밀번호 찾기" class="loginButton" style="display: none; background: #808080;"/>
				<input type="submit" value="비밀번호 찾기" class="loginButton" style="display: none;"/>
			</form>
		</div>
		<!-- 하단 나비 -->
		<div id="bottomWrapper">
			<ul>
				<li><a href="/signUpForm">Sign Up</a></li>
				<li><a href="/login/checkPh">Find ID</a></li>
				<li><a href="/login/checkId">Find Password</a></li>
			</ul>
		</div>
		<!-- foot -->
		<%@ include file="../main/foot.jsp"%>
		<!-- foot 끝 -->
	</div>

</body>
</html>