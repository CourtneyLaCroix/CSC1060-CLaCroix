import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		File myFile = new File("addresses.csv");
		
		try {
			if(!myFile.exists()){
				myFile.createNewFile();
			}
		}
		catch(IOException e) {
			System.out.println("Oops! \n bye bye \n");
			System.exit(-1);
		}
		
		FileWriter fileWriter = new FileWriter(myFile.getName(), true);
		BufferedWriter bw = new BufferedWriter(fileWriter);
		bw.write("FirstName, LastName, Address\n");
		bw.write("John, Doe, 345 Maple St.\n");
		bw.write("Jane, Doe, 649 Acorn Dr.\n");
		
		bw.flush();
		bw.close();
		fileWriter.close();
	}

}
