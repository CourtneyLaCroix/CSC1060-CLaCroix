
public class Farm {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat("Garfield", 25.0, 5.0, "Orange");
		
		System.out.println(cat1);
		
		Animal[] animals = new Animal[5];
		
		animals[0] = cat1;
		animals[1] = new Cat();
		animals[2] = new Dog();
		animals[3] = new Dog();
		animals[4] = new Horse();
	}

}
