
public class Car {
	
	//data members
	private String color;
	private int mileage;
	private double amountOfGas;
	private boolean isClean = false;
	private SteeringWheel stWheel;
	private Wheel[] wheels = new Wheel[4];
	
	//constructor
	public Car () {
		color = "Grey";
		mileage = 4;
		amountOfGas = 2.0;
		stWheel = new SteeringWheel(true, "leather");
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel(15, "Iron");
		}
	}
	
	public Car(String color, int mileage) {
		this.color = color;
		this.mileage = mileage;
		amountOfGas = 2.0;
		
	}
	
	
	//Getter and Setters (Accessor's and Mutators)
	public String getColor() {
		return color;
	}
	public int getMileage() {
		return mileage;
	}
	public double getAmountOfGas() {
		return amountOfGas;
	}

	
	public void setColor(String color) {
		this.color = color;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void setAmountOfGas(double amountOfGas) {
		this.amountOfGas = amountOfGas;
	}
	
	//methods
	public void drive(int numMiles) {
		for (int i = 0; i < numMiles; i++) {
			System.out.print("+");
		}
		System.out.println();
		
		mileage += numMiles;
		amountOfGas -= 0.2 *numMiles;
	}
	
	public void selfClean() {
		isClean = true;
	}
	
	public static void cleanCar(Car car) {
		car.isClean = true;
	}
	
	//toString
	public String toString() {
		String str = "Color " + color 
				 	+ " Mileage: " + mileage
					+ " Gas: " + amountOfGas
					+ " Clean: " + isClean;
		return str;
	}
	
}

