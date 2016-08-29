package ch06.exam13;

public class School {
	private static School school = new School();
	
	private School(){
		
	}
	
	static School getInstance(){ //School.school = null;을 막기 위해 사용
		return school;
	}
}
