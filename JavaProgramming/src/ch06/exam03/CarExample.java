package ch06.exam03;

public class CarExample {
	public static void main(String[] args) {
		//Car 변수 선언
		Car myCar = null;
		//Car 객체를 생성하고 위치 정보 얻기
		try{
			myCar = new Car();
		} catch (Exception e){}
		//객체 있는지 조사
		if(myCar != null){
			System.out.println("Car 객체 존재");
		}else{
			System.out.println("Car 객체 없음");
		}
		
		//객체내부의 필드값을 읽어보자
		System.out.println(myCar.company);
		//객체 내부의 필드값을 변경
		myCar.company = "KOSA";
		System.out.println(myCar.company);
			
		//객체 내부의 메소드를 호출해 보자
		myCar.run();
		
	}
}
