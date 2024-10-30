import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class CSclasses {

	public static void main(String[] args) {
		Course[] courseList = new Course[5];
		
		courseList[0] = new Course();
		courseList[1] = new Course();
		courseList[2] = new Course();
		
		courseList[0].setNumStudents(20);
		courseList[1].setCourseNumber("Welding");
		
		
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
		
		//System.out.println(Arrays.toString(courseList));
		//for (Card cd: oPile.cards) {              //for EACH Card (type) card IN decks
				//	cards.add(cd);
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
