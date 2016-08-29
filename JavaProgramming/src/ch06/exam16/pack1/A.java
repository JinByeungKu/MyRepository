package ch06.exam16.pack1;

public class A {
	private int field1;//나만 사용가능한거
	int field2; //같은 패키지만 사용할수 있는거
	public int field3; //모든 어디서든 사용가능한거
	
	private A() {}
	A (int field1) {}
	public A(int field1, int field2){}
	
	
	private void method1(){}
	void method2(){}
	public void method3(){}
}
