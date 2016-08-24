package ch06.exam08;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		double result1 = myCom.sum1(new int[]{10,20,30,40,50});
		System.out.println(result1);
		double result2 = myCom.sum2(10,20,30,40,50);
		System.out.println(result2);

	}

}
