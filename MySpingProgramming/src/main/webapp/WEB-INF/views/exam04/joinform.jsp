<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		Exam04
		<hr/>
		[회원 가입 폼] <br/>
		<form method="post"  action="/myapp1/exam04/join">
			아 이 디: <input type="text" name="mid" value="fall"/> <br/>   <%--name==mid라는 파라미터 값이 됨 --%>
			이    름: <input type="text" name="mname" value="한가을"/> <br/>
			비밀번호: <input type="password" name="mpassword" value="12345"> <br/>
			이 메 일: <input type="email" name="memail" value="fall@naver.com"> <br/>
			전화번호: <input type="tel" name="mtel" value="010-5673-2501"> <br/>
			직    업: <input type="radio" name="mjob" value="대학생">대학생
				   <input type="radio" name="mjob" checked value="회사원">회사원
				   <input type="radio" name="mjob" value="공무원">공무원 <br/>
			개발분야: 
				<input type="checkbox" name="mskill" value="Web">웹 개발
			    <input type="checkbox" name="mskill" value="System">시스템 개발
			    <input type="checkbox" name="mskill" value="Bigdata">빅 데이터 개발
			    <input type="checkbox" name="mskill" value="IOT" checked>IOT 개발<br/>
		      주   소: 
		      <select name="maddress1">
		      	<option>서울특별시</option>
		      	<option selected>경기도</option>
		      	<option>부산광역시</option>
		      	<option>대구광역시</option>
		      	<option>제주특별시</option>
		      </select> -
		      <select name="maddress2">
		      	<option>인천시</option>
		      	<option>수원시</option>
		      	<option selected>용인시</option>
		      	<option>부천시</option>
		      	<option>의왕시</option>
		      </select> <br/>
		      
		      생년월일 : <input type="date" name="mbirth" value="2016-09-29"/>
		      
		      <%-- 
		      <input type = "submit" value="가입"/>
		      <button>가입</button>
		       --%>
		       
		      <input type="image" src="/myapp1/resources/image/join.png" width="100"/>
		</form>
	</body>
</html>