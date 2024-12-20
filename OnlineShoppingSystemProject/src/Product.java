
public class Product {
	private String productID;
	private String name;
	private double price;
	
	public Product() {
		super();
	}

	public Product(String productID, String name, double price) {
		super();
		this.productID = productID;
		this.name = name;
		this.price = price;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "productID: " + productID + "\n" +
				"name: " + name + "\n" +
				"price: " + price + "\n";
	}
	
	
	
	

}
