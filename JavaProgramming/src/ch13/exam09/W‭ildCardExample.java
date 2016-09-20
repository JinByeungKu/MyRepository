package ch13.exam09;

public class W‭ildCardExample {
	public static void registerCourse1(Course<?> course){}
	public static void registerCourse2(Course<? extends Student> course){}
	public static void registerCourse3(Course<? super Worker> course){}
	
	
	public static void main(String arg[]){
		Course<Person> c1 = new Course<Person>("일반인 과정", 5);
		registerCourse1(c1);
		registerCourse3(c1);
		
		Course<Worker> c2 = new Course<Worker>("직장인 과정", 5);
		registerCourse1(c2);
		registerCourse3(c2);
		
		Course<Student> c3 = new Course<Student>("학생 과정", 5);
		registerCourse1(c3);
		registerCourse2(c3);
		//registerCourse3(c3);
	}
	
}
