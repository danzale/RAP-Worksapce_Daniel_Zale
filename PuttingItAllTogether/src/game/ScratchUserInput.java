package game;

import java.util.Scanner;

public class ScratchUserInput {
private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//asking the user their name
		String name = getInput("What is your name");
		System.out.println("Nice to meet you " + name);
		
		scan.close();
	}
	
	private static String getInput(String prompt) {
		System.out.println(prompt);
		//one word scan.next();
		return scan.nextLine();
		
	}
}
