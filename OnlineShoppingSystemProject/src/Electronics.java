
public class Electronics extends Product{
	private int warrantyPeriod;

	public Electronics() {
		super();
	}

	public Electronics(int warrantyPeriod) {
		super();
		this.warrantyPeriod = warrantyPeriod;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public String toString() {
		return "Electronics [warrantyPeriod: " + warrantyPeriod + "]";
	}
	
	
	
	
}
