package ch06.exam08;

public class Computer {
	double sum1(int[] value){
		int sum =0;
		for (int i = 0; i < value.length; i++) {
			sum += value[i];
		}
		double avg = (double)sum/value.length;
		return avg;
	}
	
	double sum2(int ... values){
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		double avg = (double)sum/values.length;
		return avg;
	}
}
