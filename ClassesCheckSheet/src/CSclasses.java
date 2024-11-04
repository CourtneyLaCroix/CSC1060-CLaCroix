import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class CSclasses {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		Course[] courseList = new Course[5];
		
		
		
		courseList[0] = new Course();
		courseList[1] = new Course();
		courseList[2] = new Course();
		
		courseList[0].setNumStudents(20);
		courseList[1].setCourseNumber("Welding");
		
		List<Student> students = new ArrayList<>();
		Student Andy = new Student("Andy", "Johnson", 1893435);
		Student Alex = new Student();
		Student Artie = new Student();
		
		students.add(Andy);
		students.add(Alex);
		students.add(Artie);
		
		System.out.println("Please Enter Student ID");
		int studentChecker = scn.nextInt();
		
		System.out.println("Please Enter Course ID");
		int courseChecker = scn.nextInt();
		
		System.out.println(Andy);
		
		for (int i = 0; i < courseList.length; i++) {
			 if (i == 3) {
				courseList[i] = new Course("Math1450", 15, 30, 5);
			}
			else if (i == 4) {
				courseList[i] = new Course("English 101", 15, 30, 5);
			}
			else if (i == 5) {
				courseList[i] = new Course("World History", 15, 30, 5);
			}
			
		}
		
		for (Course course: courseList) {
			System.out.println(printCourse(course));
		}
		
	}
	
	public static String printCourse(Course crs) {
		return "Course Number: " + crs.getCourseNumber() + 
				"\nNumber of Students: " + crs.getNumStudents() + 
				"\nMax Students: " + crs.getMaxStudents() +
				"\ncredits: " + crs.getCredits() +
				"\n";
	}
	
	
}
