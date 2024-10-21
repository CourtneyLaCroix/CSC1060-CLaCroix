
public class Array {

	public static void main(String[] args) {
		int num;
		int[] Pi = {3, 1, 4};
		
		int[] numbers;
		
		String[] greetings = {"Hello", "Goodbye", "Howdy"}; // if you know what is going in the array, you can 
		//create arrays like this.
		
		double[] vals = {2.5, 4.6, 5.3, 5.7};
		
		numbers = new int[5]; // when this is declared - it is created in memory here
		
		numbers[0] = 1;
		
		numbers[1] = 9;
		
		numbers[2] = 5;
		
		numbers[3] = 2;
		
		numbers[4] = 5;
		
		num = numbers[4];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * 2 ; // multiplies all values in array by 2
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		
	}

}
