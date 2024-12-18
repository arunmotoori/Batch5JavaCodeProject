package classesandobjects;

public class Demo {

	public static void main(String[] args) {
		
		Car bmwx1 = new Car("BMW", "X1", 6000000);
		bmwx1.startCar();
		bmwx1.stopCar();
		bmwx1.carDetails();
		
		Car hyi20 = new Car("Hyundai","i20",1200000);
		hyi20.startCar();
		hyi20.stopCar();
		hyi20.carDetails();
		
		Car kc = new Car("Kia","Carens",2500000);
		kc.startCar();
		kc.stopCar();
		kc.carDetails();
		
		Car hamz = new Car("Honda","Amaze",900000);
		hamz.startCar();
		hamz.stopCar();
		hamz.carDetails();

	}

}
