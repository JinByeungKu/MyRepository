package ch06.example;

public class ShopService {
	private static ShopService getInstance = new ShopService();
	
	public ShopService() {
		
	}
	
	static ShopService getInstance(){
		return getInstance;
	}
}
