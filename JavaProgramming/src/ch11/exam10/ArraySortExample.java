package ch11.exam10;

import java.util.Arrays;

public class ArraySortExample {
	public static void main(String[] args) {
		int[] scores = {99, 98, 97};
		
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		Member2[] members = {
				new Member2("홍길동",99),
				new Member2("박동수",97),
				new Member2("김연수",98)
		};
		
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
	}
}

class Member2 implements Comparable{
	
	String name;
	int score;
	Member2(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	@Override
	public int compareTo(Object o) {            //문자열 비교, 두객체를 비교해야 할때
		System.out.println("CompareTo");
		Member2 target = (Member2) o;
		return score-target.score;                //점수가 작은 사람부터 출력하는 코드
		//return name.compareTo(target.name);
		//return name.compareTo(target.name)*(-1);    //ㅎ부터 출력되게 할려고 할때
	}
	
	@Override
	public String toString() {       
		
		return name;
	}
}
