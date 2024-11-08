
public class Pirate {
	private String pirateName;
	private int pirateHP;
	private String pirateJob;
	
	public Pirate() {
		pirateName = "";
		pirateHP = 25;
		pirateJob = "Lackey";
	}

	public Pirate(String pirateName, int pirateHP, String pirateJob) {
		super();
		this.pirateName = pirateName;
		this.pirateHP = pirateHP;
		this.pirateJob = pirateJob;
	}

	public String getPirateName() {
		return pirateName;
	}

	public void setPirateName(String pirateName) {
		this.pirateName = pirateName;
	}

	public int getPirateHP() {
		return pirateHP;
	}

	public void setPirateHP(int pirateHP) {
		this.pirateHP = pirateHP;
	}

	public String getPirateJob() {
		return pirateJob;
	}

	public void setPirateJob(String pirateJob) {
		this.pirateJob = pirateJob;
	}

	
}
