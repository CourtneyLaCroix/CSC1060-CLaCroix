
public class Dog extends Animal{

	public Dog() {
		super();
	}

	public Dog(String name, double weight, double height) {
		super(name, weight, height);
	}

	@Override
	public String toString() {
		return "Dog [getName()=" + getName() + ", getWeight()=" + getWeight() + ", getHeight()=" + getHeight()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
	
	
}
