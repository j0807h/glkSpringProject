<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<!-- 타이틀 -->
	<div id="topWrapper">
		<a href="javascript:history.back();">
			<span><</span>뒤로가기
		</a>
		<h2>
			Login
		</h2>
	</div>
	<!-- 타이틀 끝 -->
	<!-- 로그인 -->
	<div id="LoginWrapper">
		<div class="LoginDataWrap">
			<form:form action="loginAct" method="post" name="frm">
				<div class="idForm">
					<form:input path="userId" id="userId" placeholder="ID" />
				</div>
				<div class="passForm">
					<input type="password" name="userPw" id="userPw" placeholder="PW" />
				</div>

				<!-- 에러 -->
				<div>
					<form:errors path="userId"/>&nbsp;
					<form:errors path="userPw"/>&nbsp;
<%-- 					<span>${valid_userId }</span>&nbsp; --%>
<%-- 					<span>${valid_userPw }</span> --%>
				</div>
				<input type="submit" value="LOG IN" class="loginButton" />
			</form:form>
		</div>
	</div>
</body>
</html>