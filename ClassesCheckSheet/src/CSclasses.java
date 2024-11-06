import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class CSclasses {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		Course[] courseList = new Course[5];
		
		
		
		courseList[0] = new Course();
		courseList[1] = new Course();
		courseList[2] = new Course();
		
		courseList[0].setNumStudents(20);
		courseList[1].setCourseNumber("Welding 1470");
		
		List<Student> students = new ArrayList<>();
		Student Andy = new Student("Andy", "Johnson", 1893435);
		Student Alex = new Student("Alex", "Smith", 8734659);
		Student Artie = new Student("Artie", "Jones", 987343);
		
		students.add(Andy);
		students.add(Alex);
		students.add(Artie);
		
		
		for (int i = 0; i < courseList.length; i++) {
			 if (i == 3) {
				courseList[i] = new Course("Math1450", 15, 25, 5);
			}
			else if (i == 4) {
				courseList[i] = new Course("English 101", 15, 25, 5);
			}
			else if (i == 5) {
				courseList[i] = new Course("World History", 15, 25, 5);
			}
			
		}
		
		
		System.out.println("Please Enter Student ID");
		int studentChecker = scn.nextInt();
		
		
		System.out.println("What course would you like to add?");
		int courseChecker = scn.nextInt();
		
	
//		students[studentChecker].addCourse(courseList[courseChecker]);
		
		Course theCourse = null;
		for (Course csr: courseList) {
			if (csr.getID() == courseChecker) {
				theCourse = csr;
			}
		}
		
		Student theStudent = null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getID() == studentChecker) {
				theStudent = students.get(i);
			}
	}
	

		theStudent.addCourse(theCourse);
		theCourse.addStudent(theStudent);
		
		System.out.println(Andy);
		
		
		Map<Integer, Course> coursesMap = new HashMap<>();
		
		coursesMap.put(0, courseList[0]);
		
		
		
//		for (Course course: courseList) {
//			System.out.println(printCourse(course));
//		}
	
	}
	
	public static String printCourse(Course crs) {
		return "Course Number: " + crs.getCourseNumber() + 
				"\nNumber of Students: " + crs.getNumStudents() + 
				"\nMax Students: " + crs.getMaxStudents() +
				"\ncredits: " + crs.getCredits() +
				"\n";
	}
}
