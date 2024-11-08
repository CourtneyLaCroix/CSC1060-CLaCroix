import java.util.ArrayList;
import java.util.List;

public class Ship {
	private static int shipCounter = 0;
	private final int shipID;
	private String shipName;
	private int shipHP;
	private int numCannons;
	private List<Pirate> pirateList = new ArrayList<>();
	
	
	public Ship() {
		shipCounter++;
		shipID = shipCounter;
		shipName = "";
		shipHP = 100;
		numCannons = 0;
	}


	public Ship(int shipID, String shipName, int shipHP, int numCannons) {
		super();
		this.shipID = shipID;
		this.shipName = shipName;
		this.shipHP = shipHP;
		this.numCannons = numCannons;
	}


	public static int getShipCounter() {
		return shipCounter;
	}


	public static void setShipCounter(int shipCounter) {
		Ship.shipCounter = shipCounter;
	}


	public String getShipName() {
		return shipName;
	}


	public void setShipName(String shipName) {
		this.shipName = shipName;
	}


	public int getShipHP() {
		return shipHP;
	}


	public void setShipHP(int shipHP) {
		this.shipHP = shipHP;
	}


	public int getNumCannons() {
		return numCannons;
	}


	public void setNumCannons(int numCannons) {
		this.numCannons = numCannons;
	}


	public List<Pirate> getPirateList() {
		return pirateList;
	}


	public void setPirateList(List<Pirate> pirateList) {
		this.pirateList = pirateList;
	}


	public int getShipID() {
		return shipID;
	}
	
	
	
}
