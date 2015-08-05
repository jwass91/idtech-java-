import java.util.Scanner;

public class PrintStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner playerInput = new Scanner(System.in);
		
		String playerName = playerInput.nextLine();
		System.out.println("Hey " + playerName);
		
		playerInput.close();
	}

}


