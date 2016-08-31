package ch07.exam15;

public class Member {
	String name;
	String id;
	String password;
	String age;
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	boolean login(String id, String password){
		return true;
	}
	void logout(String id){
		return;
	}
}
