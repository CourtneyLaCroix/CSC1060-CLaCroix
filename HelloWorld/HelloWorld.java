
public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("\"Hello World!\"");
		System.out.println("My name is Courtney~");

	}

	public static int roundSum(int a, int b, int c) {
		return round10(a) + round10(b) + round10(c);
	}

	public static int round10(int num){
		  if ((num % 10 >= 1) && (num % 10 <= 4)){
		    return (num % 10);
		  }
		  else if((num % 10 >= 5) && (num % 10 <= 9)){
		  return (num + 10) % 10;
		}
		  return 0;
		}

}
