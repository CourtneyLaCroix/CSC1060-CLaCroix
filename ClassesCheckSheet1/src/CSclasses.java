import java.util.ArrayList;
import java.util.List;

public class CSclasses {

	public static void main(String[] args) {
		Courses course1 = new Courses("CSC1060", 0, 25, 4);
		Courses course2 = new Courses("Python1019", 0, 25, 4);
		FullRemoteCourse course3 = new FullRemoteCourse("Math1040", 0, 30, 4);
		RealTimeRemoteCourse course4 = new RealTimeRemoteCourse("Eng 101", 0, 20, 3);
		
		
		List<Courses> coursesList = new ArrayList<>();
		
		coursesList.add(course1);
		coursesList.add(course2);
		coursesList.add(course3);
		coursesList.add(course4);
		
		for (Courses csr: coursesList) {
			
		}
		
		
		
		
	}
	
	public String printDetails(Courses crs) {
		return crs.toString();
	}
	
	public String printDetails2(Courses crs) { 
		if(crs instanceof FullRemoteCourse) {
			return crs.getCourseNumber() + crs.getNumStudents() + crs.getMaxStudents() + crs.getCredits();
		}
		if(crs instanceof RealTimeRemoteCourse) {
			return crs.getCourseNumber() + crs.getNumStudents() + crs.getMaxStudents() + crs.getCredits();
		}
		if(crs instanceof InPersonCourses) {
			return crs.getCourseNumber() + crs.getNumStudents() + crs.getMaxStudents() + crs.getCredits();
		}
		return "error";
	}

}
