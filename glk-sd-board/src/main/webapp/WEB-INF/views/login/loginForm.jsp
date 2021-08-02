<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link href="<c:url value='/static/css/top.css'/>" rel="stylesheet" type="text/css" />
<link href="<c:url value='/static/css/loginForm.css'/>" rel="stylesheet" type="text/css" />
<link href="<c:url value='/static/css/footer.css'/>" rel="stylesheet" type="text/css" />
</head>
<body>
<!-- 	top -->
		<%@ include file="../main/top.jsp" %>
<!-- 	top 끝 -->
	<!-- 타이틀 -->
	<div id="topWrapper">
		<a href="javascript:history.back();"><span>◁</span>뒤로가기</a>
			
		<h2>
			Login
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
			<!-- 화면 바뀌게 -->
			<form:form action="loginAct" method="post" name="frm" modelAttribute="loginVO">
				<div class="idForm">
<!-- 					<input type=text name="userId" id="userId" placeholder="ID" /> -->
					<form:input path="userId" id="userId" placeholder="ID" />
				</div>
				<div class="passForm">
					<input type="password" name="userPw" id="userPw" placeholder="PW" />
				</div>

				<!-- 에러 -->
				<div>
<%-- 					<form:errors path="userId"/>&nbsp; --%>
<%-- 					<form:errors path="userPw"/>&nbsp; --%>
				</div>
				<input type="submit" value="LOG IN" class="loginButton" />
			</form:form>
		</div>
		<!-- 하단 나비 -->
		<div id="bottomWrapper">
			<ul>
				<li><a href="/signUpForm">Sign Up</a></li>
				<li><a href="/login/checkPh">Find ID</a></li>
				<li><a href="/login/checkId">Find Password</a></li>
			</ul>
		</div>
	</div>

	<!-- foot -->
		<%@ include file = "../main/foot.jsp" %>
	<!-- foot 끝 -->
</body>

</html>