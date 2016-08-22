package ch05.exam02;

public class ArrayInArray {

	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		
		System.out.println(scores[1][0]);
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		
		
		
		
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				System.out.println(scores[i][j]);
				
			}
		}
		
		System.out.println("°ª º¯°æ");
		
		scores[0][1] = 50;
		System.out.println(scores[0][1]);

	}

}
