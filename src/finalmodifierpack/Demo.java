package finalmodifierpack;

public class Demo {

	public static void main(String[] args) {
		
		Car.wheels = 4;
		System.out.println(Car.wheels);
		Car.price=900000;
		System.out.println(Car.price);
		Car.startCar();
		Car.stopCar();
		
		String str = new String("Arun");
		int len = str.length();
		System.out.println(len);
		String res = String.valueOf(len)+"Motoori";
		System.out.println(res);
	}

}
