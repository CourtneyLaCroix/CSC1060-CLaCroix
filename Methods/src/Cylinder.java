import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		Scanner scn;
		scn = new Scanner(System.in);
		
		double radius;
		double length;
		
	System.out.println("What is the radius?");
	radius = scn.nextDouble();
	System.out.println("What is the length?");
	length = scn.nextDouble();
	
	double areaResult = computeArea(radius);
	double volumeResult = computeVolume(areaResult, length);
	
	System.out.printf("The area is %.2f and the volume is %.2f", areaResult, volumeResult);
	
		
	
	}
	public static double computeArea(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}
	public static double computeVolume(double area, double length) {
		double volume = area * length;
		return volume;
	}
	

}
