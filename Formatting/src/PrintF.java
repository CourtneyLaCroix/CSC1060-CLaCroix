
public class PrintF {

	public static void main(String[] args) {
		int num1 = 23456712;
		int num2 = 546;
		
		System.out.printf("the value is %-10d and the other is %-10d.\n",
				num2, num1);
		System.out.printf("the value is %0,10d and the other is %0,10d.\n",
				num1, num2);
		
		double fnum1 = 23.456738;
		double fnum2 = 5687.34;
		
		
		System.out.printf("the value is %.3f and the other is %.3f.\n",
				fnum2, fnum1);
		System.out.printf("the value is %.3f and the other is %.3f.\n",
				fnum1, fnum2);
		
		String str1 = "Hello";
		String str2 = "World";
		String str3 = String.format("%s %s! Your lucky number is %d. \n", str1, str2, num2);
		
		System.out.printf("%s %s! Your lucky number is %d. \n", str1, str2, num2);
		
		System.out.println(str3);
		
	}

}
