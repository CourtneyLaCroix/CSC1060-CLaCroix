
public class Calculator {
	public Calculator() {}
	
	public double add(double a, double b) {
		return a + b;
	}
	public double add(double a, double b, double c) {
		return add(a, b) + c;
	}
	
	public double subtract(double a, double b) {
		return a - b;
	}
	
	public double subtract(double a, double b, double c) {
		return subtract(a, b) - c;
	}
	
	//a divided by b, but b cannot be 0
	public double divide(double a, double b) {
		if (isZero(b)) {
			return a;
		}
		return (a / b);
	}
	
	private boolean isZero(double suspect) {
		return suspect == 0;
	}
	
}
