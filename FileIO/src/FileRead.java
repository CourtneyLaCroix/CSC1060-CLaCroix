import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		File readFile = new File("addresses.csv");
		Scanner scn = null;
		
		try {
			scn = new Scanner(readFile);
		}
		catch(FileNotFoundException e) {
			System.out.println("I guess I should have the file first! WOWIE");
			System.exit(-1);
		}
		
		boolean header = true;
		while(scn.hasNextLine()) {
			if (header) {
				header = false;
				String line = scn.nextLine();
				continue;
			}
			String line = scn.nextLine();
//			System.out.println(line);
			String[] tokens = line.split(",");
			
			String firstName = tokens[0];
			String lastName = tokens[1];
			String address = tokens[2];
			
			System.out.println(firstName + lastName + address);
		}

	}

}
