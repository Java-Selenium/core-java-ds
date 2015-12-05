package userdefinedclass;

public class Car {
	String carModel = "Acura" ;
	public Car(String carModel){
		
		this.carModel = carModel;
		System.out.println(carModel);
	}
	
	public void driver(){
		System.out.println("Need a driver to drive the car");
	}

}
