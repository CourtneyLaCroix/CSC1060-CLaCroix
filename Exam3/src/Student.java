
public class Student extends Person{
	private int status;


	public final String[] STATUS = {
		null, "freshman", "sophomore", "junior", "senior"
	};


	public Student(String name, String address, String phoneNumber, String emailAddress, int status) {
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
	}


	public String getStatus() {
		return STATUS[status];
	}


	public void setStatus(int status) {
		this.status = status;
	}

	public String toString() {
		return STATUS[status];
	}

}
