package ch06.exam11;

import java.util.Scanner;

public class ScoreManagement {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		//String[][] students = null;
		Student[] students = null;
		
		
		
		while (true) {
			System.out.println("------------------------------------------------------------");
			if(students == null){
				System.out.println("1.총 학생수 | 7.종료");
			} else{
				System.out.println("1.총 학생수 | 2.목록 | 3.입력 | 4.삭제 | 5.최고점수 | 6.평균점수 | 7.종료");
			}
			System.out.println("------------------------------------------------------------");
			System.out.print("선택> ");
			String choiceNum = scanner.nextLine();
			
			if(choiceNum.equals("1")){
				System.out.print("총 학생수> ");
				int totalNum = Integer.parseInt(scanner.nextLine());
				students = new Student[totalNum];
				
			}else if(choiceNum.equals("2")){
				System.out.println("-----------------------------------------");
				System.out.println("학번\t\t이름\t\t점수");
				System.out.println("-----------------------------------------");
				//if(students != null){
					for(int i=0;i<students.length;i++){
						if(students != null){ //목록값을 주지 않았으므로 배열에는 null이 들어가 있다. 그래서 null이 아닐 때만 실행하도록 한다.
							Student student = students[i];
							System.out.println(student.no + "\t\t" + student.name + "\t\t" + student.score); //입력을 주지 않고 목록을 출력했을 경우 nullpointException 출력
						}
					//}
				}
			}else if(choiceNum.equals("3")){
					//System.out.println("학번: " + studentNum);
					System.out.print("학생이름: ");
					String name = scanner.nextLine();
					System.out.print("학생점수: ");
					int score = Integer.parseInt(scanner.nextLine());
					for(int i=0;i<students.length;i++){
						if(students[i] == null){
							Student student = new Student(i, name, score);
							students[i] = student;
							break; //null을 찾았으니까 break를 통해 나온다.
						}
					}
			}else if(choiceNum.equals("4")){
				System.out.print("삭제할 학번> ");
				int sno = Integer.parseInt(scanner.nextLine());
				students[sno] = null;
				if(students[sno] == null)
					System.out.println("성공적으로 삭제했습니다.");
			}else if(choiceNum.equals("5")){
				int max=0;
				//for(Student student : students){
				for(int i=0;i<students.length;i++){
					if(students != null){
						if(max < students[i].score){
								max = students[i].score;
						}
					}
				}
				System.out.println("-----------------------------------------");
				System.out.println("학번\t\t이름\t\t점수");
				System.out.println("-----------------------------------------");
				for(Student student : students){
					if(student != null){ 
						if(max == student.score){
							System.out.println(student.no +", " + student.name + ", " + student.score);
						}
					}
				}
			}else if(choiceNum.equals("6")){
				int count =0;
				int sum =0;
				double avg =0;
				for(Student student : students){
					if(student != null){
						count++;
						sum += student.score;
					}
					
				}
				avg = (double)sum/count;
				System.out.println("평점: " + avg);
			}else if(choiceNum.equals("7")){
				break;
			}
			
		}
	}
}

