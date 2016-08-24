package ch06.exam12;

public class Example {
	public static void main(String[] args) {
		InstanceMember im = new InstanceMember();
		System.out.println(im.field);
		im.field = "자바";
		im.method();
		
		
		System.out.println();
		//StatiMember.filed = "자바";
		//StatiMember.method();
		System.out.println(StatiMember.field);
		//StatiMember sm = new StatiMember();
	}
}
