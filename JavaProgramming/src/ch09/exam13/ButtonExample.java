package ch09.exam13;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		int value = 10;
		
		btnOk.setOnClickListner(new Button.OnClickListner() {
			
			//value = 5;
			@Override
			public void onClick() {
				System.out.println("음악을 재생합니다.");
				
			}
		});
		btnOk.click();
	}
	

}
