package ch09.exam13;

public class Button {
	
	public static interface OnClickListner{
		void onClick();
	}
	
	private OnClickListner onClickListner;
	
	
	public void setOnClickListner(OnClickListner onClickListner) {
		this.onClickListner = onClickListner;
	}


	public void click(){
		if(onClickListner != null)
			onClickListner.onClick();
	}
	
	
}
