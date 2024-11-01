
public class Driver {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("Color: " + myCar.getColor());
		System.out.println("Amount of gas: " + myCar.getAmountOfGas());
		System.out.println("Car's mileage: " + myCar.getMileage());
		
		myCar.setColor("Pink");
		System.out.println("Color: " + myCar.getColor());
		
		System.out.println(myCar.toString());
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		myCar.drive(5);
		
		myCar.selfClean();
		
		System.out.println(myCar);
		
		Person per1 = new Person("John", "Galt", 6, 175.5);
		
		System.out.println(per1);
		
		Car.cleanCar(myCar);
	}


}
