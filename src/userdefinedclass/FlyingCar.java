package userdefinedclass;


public class FlyingCar {
	Car sedan = new Car("Pathfinder");
	String model = "";
	public void fly(){
		sedan.driver();
		System.out.println("This car can fly");
	}
	
	public void setModel(Car car){
		System.out.println(car.carModel); 
	}
	public void getModel(){
	  
		System.out.println(sedan);
		
	}

}
