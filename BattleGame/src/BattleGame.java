import java.util.Random;

public class BattleGame {
	private static Random rand = new Random();

	public static void main(String[] args) {
		Character monster = new Character("Bingus", 100, 100, 30, null);
		Weapon monsterWeapon = new Weapon("Claws", 2, 0.4);
		
		monster.setWeapon(monsterWeapon);
		
		Weapon goodWeapon = new Weapon("Sword", 5, 0.5);
		
		Character goodGuy = new Character("The DUDE", 100, 100, 30, goodWeapon);
		
		
		
		
		
		while (!monster.isDead() && !goodGuy.isDead()) {
			double whoGoes = rand.nextDouble();
			
			if(whoGoes < 0.5) {
				monster.recordDamage(goodGuy.doDamage());
			}
			if(whoGoes > 0.5) {
				goodGuy.recordDamage(monster.doDamage());
			}
		}
		
		if(monster.isDead()) {
			System.out.println("The DUDE wins!");
		}
		else {
			System.out.println("Bigus wins!");
		}
		
	}

}
