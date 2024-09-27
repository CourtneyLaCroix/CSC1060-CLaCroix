import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {

		Scanner scn;
		scn = new Scanner(System.in);

		System.out.println("Lets convert the tempurature!");
		System.out.println("What is the tempurature in Fahrenheit?");

		double fah = scn.nextDouble();

		double cel = (fah - 32) * (5.0/9);
		double kel = 273.5 + ((fah - 32.0) * (5.0/9.0));

		int x = 1;
		int y = 2; 

		System.out.print(x + y);



		System.out.printf("It is %.2f degree's in Celsius\nIt is %.2f degree's in Kelvin\n",cel, kel);


		System.out.println("Lets convert the tempurature again!");
		System.out.println("What is a NEW tempurature in Celsius?");
		double cels = scn.nextDouble();
		double fahren = cels * (9.0/5) + 32;


		System.out.printf("It is %.2f degree's in Fahrenhiet\n",fahren);
	}

}
