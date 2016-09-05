package ch11.exam09;

public class NewInstanceExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("ch11.examp09" + args[0]); //forName으로 정보를 가지고 옴. 객체는 안만들어짐
		Object obj = clazz.newInstance(); //forName으로 얻은 정보를 바탕으로 객체를 만듬
		Action action = (Action) obj;     //obj가 객체참조를 함. Action 인터페이스로 타입변환해서 사용하는 것임
		action.execute();
		
	}
}
