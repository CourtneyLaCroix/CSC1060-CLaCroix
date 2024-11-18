
public class ExceptionHandling1 {

	public static void main(String[] args) throws ArithmeticException{
		int[] nums = {1, 2, 3 , 4, 5};
		
		int num1 = 6;
		int num2 = 1;
		
		Integer int1 = null;
		
		try {
		//nums[6] = 6;
		int num3 = num1 / num2;
		System.out.println("The value is " + int1.intValue());
		}
		catch (ArithmeticException e) {
			System.out.println("Sad face");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Sad face");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("VERY sad face");
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void divide(int num1, int num2) throws ArithmeticException {
		if(num2==0) {
			throw(new ArithmeticException("Divisor is zero"));
		}
		int num3 = num1 / num2;
	}
	

}
