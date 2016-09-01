package ch09.exam11;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setOnClickListner(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("음악을 재생합니다.");
				
			}
		});
		
		Button btnCancel = new Button();
		btnCancel.setOnClickListner(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("음악을 중지합니다.");
				
			}
		});
		
		btnOk.click();
		btnCancel.click();
	}
	

}
