import java.util.List;

public class Course {
	private static int courseCounter = 0;
	private final int courseID;
	private String courseNumber;
	private int numStudents;
	private int maxStudents;
	private int credits;
	private List<Student> students;
	
	public Course() {
		courseCounter++;
		courseID = courseCounter;
		courseNumber = "CSC 1060";
		numStudents = 0;
		maxStudents = 0;
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
		students.add(std);
	}
	
	public String toString() {
		return "Course Number: " + courseNumber + 
				"\nNumber of Students: " + numStudents + 
				"\nMax Students: " + maxStudents +
				"\ncredits: " + credits +
				"course ID:" + courseID +
				"\n";
		
	}
	
	
}
