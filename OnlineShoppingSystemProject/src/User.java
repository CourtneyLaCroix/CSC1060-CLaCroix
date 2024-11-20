import java.util.ArrayList;
import java.util.Arrays;

public class User {
	private String userId;
	private String userName;
	private ArrayList<Product> cart = new ArrayList<Product>();
	
	
	public User() {
		super();
	}


	public User(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}




	@Override
	public String toString() {
		return "userId: " + userId + "\n" +
				"userName: " + userName + "\n" + 
				"cart: " + cart;
	} 
	
	
	public void addToCart(Product p) {
		cart.add(p);

	}
	
	public void removeFromCart(Product p) {
		cart.remove(p);
	}
	
	public double totalPrice() {
		double total = 0;
		for(Product p: cart) {
		total = total + p.getPrice();
		}
		return total;
	}
	

}
