<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">


</head>
<body>
	Exam03
	<hr />
	[회원 가입 폼]
	<br />
	<form action="/kimoon/exam03/join">
		아이디:<input type="text" name="mid" value="fall"/><br />
		이름:<input type="text" name="mname" value="한가을"/><br />
		비밀번호:<input type="password" name="mpassword" value="12345"/><br />
		이메일:<input type="email" name="memail" value="fall@naver.com"/><br />
		전화번호:<input type="tel"name="mtel" value="010-1234-5678"/><br />
		직업:<input type="radio" name="mjob"  value="대학생"> 대학생
			  <input type="radio" name="mjob"  value="회사원" checked> 회사원
			  <input type="radio" name="mjob"  value="공무원"> 공무원<br/>
		개발분야:<input type="checkbox"" name="mskill" value="웹 개발">웹 개발
		      	   <input type="checkbox"" name="mskill" value="시스템 개발" checked>시스템 개발
    		       <input type="checkbox"" name="mskill" value="빅데이터 개발">빅데이터 개발
    		       <input type="checkbox"" name="mskill" value="사물인터넷 개발">사물인터넷 개발<br/>
    	주소:
    		<select name="maddress1">
    		<option>서울특별시</option>
    		<option selected>경기도</option>
    		<option>부산광역시</option>
    		<option>대구광역시</option>
    		<option>제주도</option>
    		</select> -
    		<select name="maddress2">
    		<option>인천시</option>
    		<option>수원시</option>
    		<option selected>용인시</option>
    		<option>부천시</option>
    		<option>의왕시</option>
    		</select><br/>
    	생년월일:
    		<input type="date" name="mbirth" value="1992-06-19"/>
    		
    		<br/>
			<%-- 
			<input type="submit" value="가입">
			<button>가입</button>
			 --%>
			<input type="image" src="/myapp/resources/image/join.png" width=300px>
	</form>
</body>
</html>