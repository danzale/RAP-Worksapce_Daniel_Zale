package game;

import java.util.Scanner;

public class GuessingGame {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		double randomNumber = Math.floor(Math.random() * 10) + 1;
		int guess = 0;
		do {
			guess = getInput("What is your guess");
			if(guess > randomNumber) {
				System.out.println("your guess was to high");
			}else if(guess < randomNumber) {
				System.out.println("your guess was to low");
			}else {
				System.out.println("Good Job");
			}
		}while (guess != randomNumber);
		
		scan.close();
	}
	
	private static int getInput(String prompt) {
		System.out.println(prompt);
		//one word scan.next();
		return scan.nextInt();
		
	}
}