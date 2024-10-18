
public class LogicKnowledge {

	public static void main(String[] args) {
		int test1 = 1;
		int test2 = 2;
		int test3 = 3;
		int test4 = 4;
		int test5 = 5;
		int test6 = 6;


		System.out.println(pickNumber(test1, test1, test1)); // 1
		System.out.println(pickNumber(test1, test2, test3)); // 6
		System.out.println(pickNumber(test1, test1, test2)); // 2
		System.out.println(pickNumber(10, 10, 10)); // 10
		

		System.out.println(equiDistance(test4, test2, test6)); //true
		System.out.println(equiDistance(4, 55, 1)); // false
		System.out.println(equiDistance(15, 30, 45)); // true
		System.out.println(equiDistance(100, 30, 45)); // false
		System.out.println(equiDistance(10, 20, 30)); // true
		System.out.println(equiDistance(1,2,3)); // true



	}
	public static int pickNumber(int a, int b, int c) {
		if (a == b && a == c) {
			return a;
		}
		if (a != b && a != c) {
			return a + b + c;
		}
		if(a == b && a != c) {
			return c;
		}
		if(a == c && a != b) {
			return b;
		}
		if(b == c && b != a) {
			return a;
		}
		return -1; // test case
	}

	public static boolean equiDistance(int a, int b, int c) {
		int largest = Math.max(Math.max(a, b), c); //compares (a,b) then result to c
		int smallest = Math.min(Math.min(a, b), c); //compares (a,b) then result to c

		int middle = ((a + b + c) - largest) - smallest;

		if (Math.abs(largest - middle) == Math.abs(middle - smallest)) {
			return true;
		}

		return false;

	}
}
