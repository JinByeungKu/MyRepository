package ch06.exam14;

public class Calculator3 {
		
		final int field2; //fianl 필드값을 주지 않았을 경우에는 값을 한번 초기화할 수있다. 
		
		Calculator3(int field2){
			this.field2 = field2;
		}
		
		public static void main(String[] args) {
			Calculator3 ca1 = new Calculator3(5); //주민번호,id와 같은 형태들을 한번 값을 주고 변경할수 없도록 할 수 있다.
			Calculator3 ca2 = new Calculator3(7);
		}
}
