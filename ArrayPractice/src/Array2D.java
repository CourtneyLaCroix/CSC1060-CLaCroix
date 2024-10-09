import java.lang.reflect.Array;
import java.util.Arrays;
public class Array2D {

	public static void main(String[] args) {
		
		int [][] tempArr;
		int size = 10;
	//	int[] arr = new int[size];
		
		int [] arr = {1, 2, 3, 4};
		
		int[][] my2Dim = new int [2][5];
		
	//	int [][] my2DimTwo = new int[row][column];
		
		int [][] my2DimThree = {{1,2,3}, 
								{4,5,6}, 
								{7,8,9}
								};
		
		//print2D(my2DimThree);
		tempArr = mulTable(size);
		
		
		
		print2D(transpose(my2DimThree));
		
		
	}
	
	public static void printMe(int[][] arr) {
		for (int[] x: arr) {
			System.out.println(Arrays.toString(x));
		}
	}
	public static void print2D(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr [i] [j] + " ");
			}
			System.out.println();
		}

	}

	public static int[][] mulTable(int size) {
		int[][] tempArr = new int[size][size];
		
		for (int x = 1; x <= size; x++) {
			for (int y = 1; y <= size; y++) {
				tempArr[x - 1] [y -1]  =  x * y;
			}
		}
		return tempArr;
	}
	public static int[][] transpose(int[][] matrix){
		int [][] temp = new int[matrix[0].length][matrix.length];

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				temp[i][j] = matrix[j][i];
			}

		}
		return temp;
	}
}
