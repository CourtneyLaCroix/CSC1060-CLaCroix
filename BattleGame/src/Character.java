import java.util.Random;

public class Character {
	private String characterName;
	private double health;
	private int strength;
	private int agility;
	private Weapon weapon;
	private Random rand = new Random();
	
	
	public Character(String characterName, double health, int strength, int agility, Weapon weapon) {
		super();
		this.characterName = characterName;
		this.health = health;
		this.strength = strength;
		this.agility = agility;
		this.weapon = weapon;
	}


	public String getCharacterName() {
		return characterName;
	}


	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}


	public double getHealth() {
		return health;
	}


	public void setHealth(double health) {
		this.health = health;
	}


	public int getStrength() {
		return strength;
	}


	public void setStrength(int strength) {
		this.strength = strength;
	}


	public int getAgility() {
		return agility;
	}


	public void setAgility(int agility) {
		this.agility = agility;
	}


	public Weapon getWeapon() {
		return weapon;
	}


	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public double doDamage() {
		double rnum = rand.nextDouble();
		double damage = rnum * strength * weapon.getDamageFactor();
		
		return damage;
	}
	
	public void recordDamage(double dmg) {
		health = health - dmg;
		if (health < 0) {
			health = 0;
		}
	}
	
	public boolean isDead() {
		return (health <= 0);
	}


	@Override
	public String toString() {
		return "Character [characterName=" + characterName + ", health=" + health + ", strength=" + strength
				+ ", agility=" + agility + ", weapon=" + weapon + "]";
	}
	
	
}
