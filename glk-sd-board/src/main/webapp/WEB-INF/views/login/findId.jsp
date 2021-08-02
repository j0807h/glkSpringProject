<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value='/static/css/loginForm.css'/>" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.15.2/css/all.css" />
</head>
<!-- 	top -->
		<%@ include file="../main/top.jsp" %>
<!-- 	top 끝 -->
	<!-- 타이틀 -->
	<div id="topWrapper">
		<a href="javascript:history.back();"><span>◁</span>뒤로가기</a>
		
		<h2>Login</h2>
	</div>
	<div id="LoginWrapper">
		<div class="description">
			<span class="title">아이디를 모르시나요?</span> <span>입력한 연락처로 아이디를 찾을
				수 있습니다.</span>
		</div>
		<div class="findId-wrap">
			<c:if test="${loginVO != null }">
				회원님의 아이디는 
				<div class="findId-area">${loginVO.userId }</div>
				입니다.
			</c:if>
			<c:if test="${loginVO == null }">
				가입한 아이디가 없습니다.
			</c:if>
		</div>
		<br />
		<!-- 하단 나비 -->
		<%@ include file = "bottomWrapper.jsp" %>
		<!-- 하단 나비 끝 -->
	</div>

	<!-- foot -->
		<%@ include file = "../main/foot.jsp" %>
	<!-- foot 끝 -->
	
</body>
</html>