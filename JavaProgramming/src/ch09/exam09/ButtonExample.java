package ch09.exam09;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setOnClickListner(new OkListner());
		
		Button btnCancel = new Button();
		btnCancel.setOnClickListner(new CancelListener());
		
		btnOk.click();
		btnCancel.click();
	}
	

}


class OkListner implements Button.OnClickListner{

	@Override
	public void onClick() {
		System.out.println("OK 버튼을 클릭했습니다.");
		
	}
	
}

class CancelListener implements Button.OnClickListner{

	@Override
	public void onClick() {
		System.out.println("Cancle버튼을 클릭했습니다.");
		
	}
}