package ch15.example;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	//해당 객체가 같은지 다른지 완벽히 검사를 하기 위해선 hashCode와 eqauls를 재정의 한다.
	@Override //같은 내용의 객체를 찾기 위해 hashCode 재정의 함
	public int hashCode() {
		
		return studentNum;  //같은 studentNum을 찾는 걸러내는 일이므로 studentNum을 반환
	}
	
	@Override //같은 내용의 객체를 찾기 위해 eqauls를 재정의 함
	public boolean equals(Object obj) {
		if(obj instanceof Student){ // obj객체가 Student객체로 만들어 졌는지 검사
			Student student = (Student) obj; //obj객체가 Student객체로 만들어 졌는지를 검사 했으므로 
			                                 //Student타입으로 강제타입변환이 가능하다
			if(studentNum == student.studentNum){ //studentNum의 번지를 비교. studentNum는 int형이므로 == 으로 비교가능
				return true;
			} else{
				return false;
			}
		}
		return false;
	}
}
