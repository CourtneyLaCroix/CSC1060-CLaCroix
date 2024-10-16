
public class Person {

	private String firstName;
	private String lastName;
	private int height;
	private double weight;
	
	
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		String str = "First name: " + firstName 
					+ " Last name: " + lastName 
					+ " Height: " + height 
					+ " Weight: " + weight;
		return str;
	}
	public Person(String firstName, String lastName, int height, double weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
	}
	
	
	
	
}
