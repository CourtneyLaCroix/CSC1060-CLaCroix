import java.util.Random;

public class Die {
	private int numSides;
	private int value;
	private Random rand = new Random();
	
	
	public Die() {
		numSides = 6;
		value = -1;
	}
	
	public Die(int numSides) {
		this.numSides = numSides;
		value = 1;
	}
	
	public Die(int numSides, int value) {
		super();
		this.numSides = numSides;
		this.value = value;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int roll() {
		int rnum = rand.nextInt(1, numSides + 1);
		value =  (rnum);
		
		return value;
	}

	@Override
	public String toString() {
		return "numSides: " + numSides + 
				" value: " + value;
	}
	
}
