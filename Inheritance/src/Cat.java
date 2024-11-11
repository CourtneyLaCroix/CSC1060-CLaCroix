
public class Cat extends Animal{
	private String color;
	
	public Cat() {
		super();
	}

	public Cat(String name, double weight, double height, String color) {
		super(name, weight, height);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", getName()=" + getName() + ", getWeight()=" + getWeight() + ", getHeight()="
				+ getHeight() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
}
