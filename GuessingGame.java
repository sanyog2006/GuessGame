package com.game.application;

import java.util.Scanner;
/*
 * This is the main class which asks user to keep a number in mind and answer questions regarding the number.
 */
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner userEntry = null;

		userEntry = new Scanner(System.in);

		do {
			System.out
					.println("Welcome to NumberGuessingGame. Enter Ready to begin");

		}

		while (!"Ready".equals(userEntry.next()));    //Unless user is ready don't take him ahead

		int maxNumber = 100;   //To keep game simple I have assumed upper limit as 100 .We can change it to any number.

		System.out.println("Guess a number between 1 and " + maxNumber + " .");

		int start = 0;  // we are considering numbers more than 0
		int end = maxNumber;

		do {

			int mid = (start + end) / 2;

			System.out.println("Is your number Higher or lower than " + mid
					+ " ?");

			String userGuess = userEntry.next();

			if ("quit".equals(userGuess) || "yes".equals(userGuess)) {

				System.out.println("Thanks for playing the game");
				break;
			} else {

				if ("lower".equals(userGuess)) {

					end = mid - 1;

				} else if ("higher".equals(userGuess)) {
					start = mid + 1;
				} else {

					System.out
							.println("Please enter higher or lower or yes or quit or ready ");

				}
			}

		} while (true);
		
		
		userEntry.close();  //close the scanner
	}
	
	

}
