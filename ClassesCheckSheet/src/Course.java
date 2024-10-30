
public class Course {
	private String courseNumber;
	private int numStudents;
	private int maxStudents;
	private int credits;
	
	public Course() {
		courseNumber = "CSC 1060";
		numStudents = 0;
		maxStudents = 0;
		credits = 0;
	}
	
	public Course(String courseNumber, int numStudents, int maxStudents, int credits) {
		super();
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

	
	
	public String toString() {
		return "Course Number: " + courseNumber + 
				"\nNumber of Students: " + numStudents + 
				"\nMax Students: " + maxStudents +
				"\ncredits: " + credits +
				"\n";
	}
	
	
}
