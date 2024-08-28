import java.util.Scanner;

public class QuadraticRoots {

	public static void main(String[] args) {
		
		Scanner scn;
		scn = new Scanner(System.in);
		
		int valA;
		int valB;
		int valC;
		
		System.out.println("What is the value of A?");
		valA = scn.nextInt();
		System.out.println("What is the value of B?");
		valB = scn.nextInt();
		System.out.println("What is the value of C?");
		valC = scn.nextInt();
		
		
		double rootResult = -valB + Math.sqrt(Math.pow(valB, 2) - 4 * (valA *valC));
		double negRootResult = -valB - Math.sqrt((valB * valB) - 4 * (valA *valC));
		
		double quadraticResult = rootResult / (2 * valA);
		double negQuadraticResult = negRootResult / (2 * valA);
		
		
		System.out.println("The roots of the quadratic equation are: " + quadraticResult + " and " + negQuadraticResult);
	}

}
