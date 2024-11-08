
public class Weapon {
	private String weaponName;
	private int range;
	private double damageFactor;
	
	Weapon(){
		
	}

	public Weapon(String weaponName, int range, double damageFactor) {
		super();
		this.weaponName = weaponName;
		this.range = range;
		this.damageFactor = damageFactor;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getDamageFactor() {
		return damageFactor;
	}

	public void setDamageFactor(double damageFactor) {
		this.damageFactor = damageFactor;
	}

	@Override
	public String toString() {
		return "Weapon [weaponName=" + weaponName + ", range=" + range + ", damageFactor=" + damageFactor + "]";
	}

	
}
