package ch06.exam14;

public class Calculator2 {
		
		final int field2; //fianl 필드값을 주지 않았을 경우에는 값을 한번 초기화할 수있다. 
		static final int FIELD4 ; //파이널 필드는 한번 들어가면 수정할 수 없다.
		
		Calculator2(){
			field2 = 5;
		}
		
		static {
			FIELD4 = 5;
		}
		
		
}
