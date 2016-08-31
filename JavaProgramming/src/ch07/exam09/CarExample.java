package ch07.exam09;

public class CarExample { 

	public static void main(String[] args) {
		Car car = new Car();
			
			for(int i=1;i<=5;i++){
				int problemLocation = car.run();
				if(problemLocation == car.run()){
					System.out.println(car.tire[problemLocation-1].location + "Hankook·Î ±³Ã¼");
					car.tire[problemLocation-1] = new HankookTire(car.tire[problemLocation-1].location, 15);
				}
				}
				System.out.println("----------------------------");
			}
		}
