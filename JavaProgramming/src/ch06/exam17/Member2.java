package ch06.exam17;

public class Member2 {
	private String mid;
	private String mname;
	private String mpassword;
	private int mage;
	private boolean madult;
	private double mheight;
	
	public Member2(String mid){
		this.mid = mid;
	}
	
	public String getMid(){
		return mid;
	}
	
	public void setMHeight(double mheight){
		if(mheight < 0.0){
			mheight = 0.0;
		}
		this.mheight = mheight;
	}
}
