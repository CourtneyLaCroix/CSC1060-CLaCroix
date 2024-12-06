import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		File myFile = new File("battlegame.csv");
		FileWriter fileWriter = new FileWriter(myFile.getName(), true);
		BufferedWriter bw = new BufferedWriter(fileWriter);
		
		try {
			if(!myFile.exists()){
				myFile.createNewFile();
			}
		}
		catch(IOException e) {
			System.out.println("Oops! \n bye bye \n");
			System.exit(-1);
		}
		
		
		System.out.println("How many sides do the die have?");
		int numSides = scn.nextInt();
		
		System.out.println("How many Players will there be?");
		int numPlayers = scn.nextInt();
		
		Player[] players = new Player[numPlayers];
		
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player();
		}
		
		for (Player p : players) {
			System.out.println("what is this the players name?");
			p.setName(scn.next());
		}
		
		for (Player p : players) {
			p.getDie().roll();
			bw.write("Player " + p.getName() + " rolled a " + p.getDie().getValue() + " on a " + numSides + " sided die");
			System.out.println("Player " + p.getName() + " rolled a " + p.getDie().getValue() + " on a " + numSides + " sided die");
		}
		
		
		System.out.println(decideWinner(players).getName() + " won the game");
		
		
		
		bw.write(decideWinner(players).getName() + " won the game");
		
		bw.flush();
		bw.close();
		fileWriter.close();
		
	}
	
	public static Player decideWinner(Player[] p) {

		for (int i = 0; i < p.length - 1; i++) {
			if (p[i].getDie().getValue() > p[i + 1].getDie().getValue()) {
				return p[i];
			} else {
				return p[i + 1];
			}
		}
		return null;
	}

}
