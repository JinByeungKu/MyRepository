package ch15.exam05;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//점수찾기
		int firstScore = scores.first();
		System.out.println(firstScore);
		
		System.out.println();
		
		int lastScore = scores.last();
		System.out.println(lastScore);
		
		System.out.println();
		
		int lowerScore = scores.lower(95);  //95라고 하는 바로 아래 점수. 95중에 가장 가까운점수중 95보다 바로 밑에 점수
		System.out.println(lowerScore);
		
		System.out.println();
		
		int higherScore = scores.higher(95);  //가장 근접한 점수 중 바로 위에 점수
		System.out.println(higherScore);
		
		System.out.println();
		
		int floorScore = scores.floor(95);  //95를 포함해서 95중에 가장 가까운 점수 중 95보다 바로 밑에 점수
		System.out.println(floorScore);
		
		System.out.println();
		
		int ceillingScore = scores.ceiling(95);  //
		System.out.println(ceillingScore);
		
		System.out.println();
		
		//정렬
		NavigableSet<Integer> desendingSet = scores.descendingSet();  //내림차순으로 정렬
		for(Integer score : desendingSet){
			System.out.print(score + ", ");
		}
		
		System.out.println();
		NavigableSet<Integer> asendingSet = desendingSet.descendingSet();  //올림차순으로 정렬, desendingSet을 두번하여 올림차순으로 변경
		for(Integer score : asendingSet){
			System.out.print(score + ", ");
		}
		
		System.out.println();
		//범위검색
		TreeSet<String> words = new TreeSet<>();
		words.add("apple");
		words.add("apply");
		words.add("forever");
		words.add("description");
		words.add("ever");
		words.add("zoo");
		words.add("base");
		words.add("guess");
		words.add("cherry");
		NavigableSet<String> ns = words.descendingSet().descendingSet();
		for(String word : ns){
			System.out.print(word + ", ");
		}
		System.out.println();
		
		NavigableSet<String> ns2 = words.subSet("c", true, "f", false);
		for(String word : ns2){
			System.out.print(word + ", ");
		}
		System.out.println();
	}
}
