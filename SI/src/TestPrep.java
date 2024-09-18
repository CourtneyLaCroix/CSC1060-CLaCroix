import java.util.Random;
import java.util.Scanner;

public class TestPrep {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("What tempurature is it outside?");
		double temp = scn.nextDouble();
		
		if (temp < 0.0) {
			System.out.println("ITS FREEZING");
		}
		if (temp <= 20.0 && temp > 0.00) {
			System.out.println("It's VERY cold, grab a BIG coat");
		}
		if (temp <= 40.0 && temp > 20.0) {
			System.out.println("It's cold, grab a coat");
		}
		if (temp <= 60.0 && temp > 40.0) {
			System.out.println("It's kinda cold, grab a hoodie");
		}
		if (temp <= 80.0 && temp > 60.0) {
			System.out.println("It's warmer, grab a light coat");
		}
		if (temp <= 100.0 && temp > 80.0) {
			System.out.println("It's HOT, leave that coat at home");
		}
		if (temp > 100.0) {
			System.out.println("It's MELTING");
		}
		
		Random rand = new Random();
		boolean choice = true; 
		
		while (choice) {
			if (rand.nextInt(1,11) == 10) {
				choice = false;
				System.out.println("exit");
			}
			
		}
			
	}

}
