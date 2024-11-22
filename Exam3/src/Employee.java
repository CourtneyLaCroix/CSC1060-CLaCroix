
public class Employee extends Person{
	private int office;
	private double salary;
	private int dateHired;


	public Employee(String name, String address, String phoneNumber, String emailAddress, int office, double salary,
			int dateHired) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}


	public int getOffice() {
		return office;
	}


	public void setOffice(int office) {
		this.office = office;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getDateHired() {
		return dateHired;
	}


	public void setDateHired(int dateHired) {
		this.dateHired = dateHired;
	}


	@Override
	public String toString() {
		return "Employee: \n"+
				"\n\toffice: " + office +
				"\n\tsalary: " + salary + 
				"\n\tdateHired: " + dateHired;
	}
}
