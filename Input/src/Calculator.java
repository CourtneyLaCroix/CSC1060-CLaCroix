import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scn;
		scn = new Scanner(System.in);

		int numA;
		int numB;
		int mulresult;
		int divresult;
		int subresult;
		int addresult;

		System.out.println("Calculator!");


		System.out.println("Enter value A");
		numA = scn.nextInt();

		System.out.println("Enter value B");
		numB = scn.nextInt();
		
		mulresult = numA * numB;
		divresult = numA / numB;
		subresult = numA - numB;
		addresult = numA + numB;

		System.out.println(numA + "*" + numB + "="+ mulresult);
		System.out.println(numA + "/" + numB + "="+ divresult);
		System.out.println(numA + "-" + numB + "="+ subresult);
		System.out.println(numA + "+" + numB + "="+ addresult);
	}

}
