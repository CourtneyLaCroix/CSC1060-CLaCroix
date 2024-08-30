import java.util.Scanner;
import java.lang.Math;

public class Circle {

	public static void main(String[] args) {
		Scanner scn;
		scn = new Scanner(System.in);
	
		double radius;

		
		System.out.println("What is the radius?");
		radius = scn.nextDouble();
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.printf("The perimiter is: %-10.2f\n", perimeter);
		System.out.printf("The area is: %-10.2f ", area);
		
		

	}

}
