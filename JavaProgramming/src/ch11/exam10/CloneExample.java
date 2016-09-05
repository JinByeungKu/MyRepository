package ch11.exam10;

public class CloneExample {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };

		int[] arr2 = arr1.clone();
		Member m1 = new Member("honㅎ", "길동");
		
/*		Member m2 = (Member)
		Member*/
		
		
	}
}

class Member {
	String mid;
	String mname;
	int age;
	String[] hobbies;

	Member(String mid, String mname) {
		this.mid = mid;
		this.mname = mname;
	}
	
	@Override
	public String toString() {
		return mid + ":" + mname;
	} 
	
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
