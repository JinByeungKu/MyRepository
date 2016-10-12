<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		Exam04
		<hr/>
		[로그인 폼] <br/>
		<form method="post"  action="/myapp/exam11/memberLogin">
			아 이 디: <input type="text" name="mid" value="fall"/> <br/>   <%--name==mid라는 파라미터 값이 됨 --%>
			비밀번호: <input type="password" name="mpassword" value="12345"> <br/>
			 <br/>
			<input type="submit" value="로그인"/>
		</form>
	</body>
</html>