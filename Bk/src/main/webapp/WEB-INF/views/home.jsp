<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
</head>
<body>
	<h1>Bk Programming</h1>
	<hr/><br/>
	
	1.  <c:if test="${login==null}">
			<a href="<%=pageContext.getServletContext().getContextPath()%>/member/login">로그인</a><br/>
		</c:if>
		
		<c:if test="${login!=null}">
			<a href="<%=pageContext.getServletContext().getContextPath()%>/member/logout">로그아웃</a>
		</c:if>
		
	2.	<c:if test="${login!=null}">
			<a href="${pageContext.servletContext.contextPath}/photoboard/list">포토 게시판</a><br/>
		</c:if>
</body>
</html>