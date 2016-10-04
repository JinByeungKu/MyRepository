<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		게시판
		<hr/>
		[게시물 등록]<br/>
		<form method="post" action="/myapp1/exam04/join">
			게시번호: <input type="text"name="bno"><br/>
			제목: <input type="text"name="btitle"><br/>
			내용: <input type="text"name="bcontent"><br/>
			글쓴이: <input type="text"name="writer"><br/>
			
			 <input type="image" src="/myapp1/resources/image/join.png" width="100"/>
		</form>
	</body>
</html> 
