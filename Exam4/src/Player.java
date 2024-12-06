
public class Player {
	private String name;
	private Die Die = new Die();
	
	
	public Player() {
		name = "Blank";
		Die = new Die();
	}
	
	public Player(String name, Die die) {
		super();
		this.name = name;
		Die = die;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Die getDie() {
		return Die;
	}


	public void setDie(Die die) {
		Die = die;
	}


	@Override
	public String toString() {
		return "Player: " + name + 
				"\nDie: " + Die;
	}
	
	
	
	

}
