package pkgDiceRolling;

import java.util.Random;
import java.util.Scanner;

public class Lab6DiceRolling {

//	method to "roll" the n-sided dice (return a random number between 1 and n)
		public static int rollDice(int sides) {
			Random randGen = new Random();
			return randGen.nextInt(sides + 1) + 1;
		}
	
		public static void main(String[] args) {
		
			
			int sides;
			int die1;
			int die2;
			int rollTimes = 1;
			Scanner scnr = new Scanner(System.in);
			String rollAgain = "";
			
			System.out.println("Welcome to the Grand Circus Casino!\n");
			
			do {
			
			// prompt user to enter number of sides on dice
			System.out.print("How many sides should each die have? ");
			sides = scnr.nextInt();
			
			//display the results of the roll for die 1, die 2
			die1 = rollDice(sides);
			die2 = rollDice(sides);
			
			// count the number of times the user rolls the dice
			System.out.println("\nRoll " + rollTimes + ":");
			rollTimes +=1;
			
			//print the value returned from the method
			System.out.println(die1);
			System.out.println(die2);
			
			
			// check for special combinations on the dice
			if (die1 + die2 == 2) {
				System.out.println("Snake Eyes!!");
			}
			else if ((die1 + die2 == 7) || (die1 + die2 == 11)) {
				System.out.println("Craps!");
			} 
			else if (die1 == 6 && die2 == 6) {
				System.out.println("Boxcars!!");
			}
			
			
			//ask if user wants to play again
			System.out.println("\nRoll again? (y/n):");
			rollAgain = scnr.next();
		
			} while (rollAgain.toLowerCase().startsWith("y"));
		
		System.out.println("Goodbye!");
		scnr.close();
	}

}
