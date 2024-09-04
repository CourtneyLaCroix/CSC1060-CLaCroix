
public class Calculater {

	public static void main(String[] args) {
		
	int num1 = 3;
	int num2 = 4;
	double num3 = div (num1, num2);
	System.out.printf("%d divided by %d equals %f\n",
			num1, num2, num3);
		

	}
	public static int add (int num1, int num2) {
		int num3 = num1 + num2;
		return num3;
	}
	public static int sub (int num1, int num2) {
		int num3 = num1 - num2;
		return num3;
	}
	public static int multiply (int num1, int num2) {
		int num3 = num1 * num2;
		return num3;
	}
	public static double div (int num1, int num2) {
		double num3 = num1 % num2;
		return num3;
	}
	

}
