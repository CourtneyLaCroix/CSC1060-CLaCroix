import java.util.Scanner;

public class SIPractice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		
		System.out.printf("The menu is  \n 1: pizza\n 2: wings\n 3: Salad");
		System.out.println("please enter what you would like to order (max 3 items)");
		System.out.println("first item?");
		int firstOrder = scn.nextInt();
		System.out.println("second item?");
		int SecondOrder = scn.nextInt();
		System.out.println("third item?");
		int ThirdOrder = scn.nextInt();
		
		
		
		if (firstOrder > 3 && firstOrder < 0 || SecondOrder > 3 && SecondOrder < 0 ||ThirdOrder > 3 && ThirdOrder < 0) {
			System.out.println("invalid order, please try again");
		}
		
		System.out.println(firstOrder, SecondOrder, ThirdOrder);
		

	}

}
