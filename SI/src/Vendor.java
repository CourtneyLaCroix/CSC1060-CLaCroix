import java.util.Scanner;

public class Vendor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] items = new String[6];
		int[] quanity = new int[6];	
		
		
		
		for (int i = 0; i < items.length; i++) {
			System.out.print(items[i] + " ");
		}
		int key = input.nextInt();
		
		do {
			switch(key) {
			case 1: 
				System.out.println("what items do you want to add?");
				addItem(items, input.next());
				break;
			
			case 2: 
				System.out.println("what items do you want to add?");
				addItem(items, input.next());
				break;
			}
		} 
		}
	
		
		
	}
	
	public static boolean addItem(String[] items, String newItem) {
		for (int i = 0; i < items.length; i++) {
			if(items[i].equals("")) {
				items[i] = newItem;
				return true;
			}
		}
		return false;
	}
	public static boolean removeItem(String[] items, String [] itemToRemove) {
		
		for (int i = 0; i < items.length; i++){
			if(items[i].equals(itemToRemove)) {
				items[i] = "";
				return true;
			}
		}
		return false;
	}
	public static void quantity(int[] quantity, int index, int updated) {
		quantity[index] = updated;
		
	}

}
