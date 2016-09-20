package ch13.exam08;

public class TextendsExample {
	public void method1(C1<Integer> arg) {}
	public void method2(C1<? extends Number> arg) {}
	public C1<? extends Number> method3(){return null;}
}


class C1<T>{}   //T를 선언
class C2<T extends Number>{}   //T를 선언하면서 넘어의 자식으로 제한
class C3{
	public <T> void method(T t){}
	public <T extends Number> void method(T t) {}
}