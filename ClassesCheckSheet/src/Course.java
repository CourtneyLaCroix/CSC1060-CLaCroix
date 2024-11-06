import java.util.ArrayList;
import java.util.List;

public class Course {
	private static int courseCounter = 0;
	private final int courseID;
	private String courseNumber;
	private int numStudents;
	private int maxStudents;
	private int credits;
	private List<Student> studentList = new ArrayList<>();
	
	public Course() {
		courseCounter++;
		courseID = courseCounter;
		courseNumber = "CSC 1060";
		numStudents = 0;
		maxStudents = 25;
		credits = 0;
	}
	
	public Course(String courseNumber, int numStudents, int maxStudents, int credits) {
		super();
		courseCounter++;
		courseID = courseCounter;
		this.courseNumber = courseNumber;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void addStudent(Student std) {
		if (numStudents >= maxStudents) {
			System.err.println("Error: Cannot exeed max students");
			return;
		}
		studentList.add(std);
		numStudents++;
	}
	
	public int getID() {
		return courseID;
	}
	
	public List<Student> getStudentList(){
		return studentList;
	}
	
	
	public String toString() {
		return "Course Number: " + courseNumber + 
				"\n\t\tNumber of Students: " + numStudents + 
				"\n\t\tMax Students: " + maxStudents +
				"\n\t\tcredits: " + credits +
				"\n\t\tcourse ID:" + courseID +
				"\n";
		
	}
	
	
}
