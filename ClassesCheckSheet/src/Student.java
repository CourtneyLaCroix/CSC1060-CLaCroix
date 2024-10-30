import java.util.ArrayList;
import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	private long sNumber;
	private List<Course> courses;
	
	
	public Student() {
		firstName = "";
		lastName = "";
		sNumber = 0;
		courses = new ArrayList<>();
	}
	
	public Student(String firstName, String lastName, long number, List<Course> coures) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sNumber = sNumber;
		this.courses = coures;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getsNumber() {
		return sNumber;
	}

	public void setsNumber(long sNumber) {
		this.sNumber = sNumber;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public void addCourse() {
		
	}
	public boolean removeCourse(Course crs) {
		return courses.remove(crs);
	}
	/*
	 *user gives course numbers -> we traverse list of courses, find course match to course number
	 *and call removeCourse
	 */
	
	public boolean removeCourse(String courseNumber) { 
		
	}
	
	
	public String toString() {
		return "Student: " + firstName + "sNumber: " + sNumber + "courses: "
				+ courses;
	}
	
	
}
