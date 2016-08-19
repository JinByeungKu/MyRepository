package ch05.exam02;

public class ArrayCreateByNew {
	public static void main(String[] args) {
		//기본타입 배열
		int[] array1 = new int[3];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		for(int i=0;i<array1.length;i++){
			System.out.println("array1[" + i + "] = " + array1[i]);
		}
		
		
		
		//참조타입 배열
		String[] array2 = new String[3];
		array2[0] = "자바";
		array2[1] = "홍길동";
		array2[2] = "대한민국";
		for(int i=0;i<array2.length;i++){
			System.out.println("array2[" + i + "] = " + array2[i]);
		}
		
	}
}
