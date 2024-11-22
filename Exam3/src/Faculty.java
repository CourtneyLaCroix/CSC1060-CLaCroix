import java.util.Arrays;

public class Faculty extends Employee{
	private String officeHours;
	private int rank;

	public final String[] RANK = {
			null, "junior", "senior"
	};

	public Faculty(String name, String address, String phoneNumber, String emailAddress, int office, double salary,
			int dateHired, String officeHours, int rank) {
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return RANK[rank];
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Faculty: \n" + 
				"\n\tofficeHours: " + officeHours +
				"rank: " + RANK[rank];
	}
}
