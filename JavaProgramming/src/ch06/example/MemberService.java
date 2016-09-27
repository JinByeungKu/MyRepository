package ch06.example;

public class MemberService {
	String id;
	String password;
	
	public boolean login(String id, String password){
		if(id == "hong" && password == "12345"){
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id){
		if(id == "hong"){
			System.out.println("로그아웃 되었습니다");
		}
	}
}
