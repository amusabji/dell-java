import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game();
	}

	public static Scanner sc = new Scanner(System.in);
	
	public static void Game() {
		//return UserHand
		String QueryUser = QueryUser();
		//return CompHand
		String CompHand = RandomizeCompHand();
		DetermineWinner(QueryUser, CompHand);
			//returns nothing (void)
		PlayAgain();
			//return ans
	}	
	
	public static String RandomizeCompHand() {
		// generating 0-2 at random
		Random randNum = new Random();
		int computersHandNum = randNum.nextInt(3);
		
		//initializing/declaring variable
		String computersHand;
		// mapping the randomizer to rock/paper/scissor
		if (computersHandNum == 0) {
			computersHand = "rock";
		} else if (computersHandNum == 1) {
			computersHand = "paper";
		} else {
			computersHand = "scissors";
		}
		System.out.println("Computer chose " + computersHand + ",");
		return computersHand; //CompHand
	}
	
	public static String QueryUser() {
		// asking user for input
		System.out.println("Please select 'rock', 'paper' or 'scissors'!");
		//read the input of the user
		
		//place the input of the user into a variable
		String usersHand = sc.nextLine();

		//TODO: error handling for bad input data
		System.out.println("You chose " + usersHand + ",");
		return usersHand;
	}
	
	public static void DetermineWinner(String user, String comp) {
		/* *System.out.println(variable.equals(word));*  <-- This is what Kevin taught us to use to check for equality of 
		 two different data typed variables.. */
		
		//local variables for easier comparison
		String r = "rock";
		String p = "paper";
		String s = "scissors";
		
		if ( //user wins:				
			(user.equals(r) && comp.equals(s)) ||
			(user.equals(p) && comp.equals(r)) ||
			(user.equals(s) && comp.equals(p))) 
		{
			System.out.println("You've beat the Computer, Congrats! You win!");

		} else if (  //Computer wins
			user.equals(s) && comp.equals(r) ||
			user.equals(r) && comp.equals(p) ||
			user.equals(p) && comp.equals(s)) 
		{
			System.out.println("Computer takes this one, better luck next time..");
			
		} else if (user.equals(comp)) { //Draw  
			System.out.println("it's a draw!");
		} else { //quick and dirty error handler
			System.out.println("oops, something went wrong.. now I go bye-bye..");
		}
	}
	
	public static void PlayAgain() {
		System.out.println("Would you like to play again? [y/N] default: yes");

		//place the user input into a variable
		String ans = sc.nextLine();

		// unless the user explicitly says NO!, we need to go into some logic
		if (ans.equalsIgnoreCase("N")) {
			System.out.println("Thanks for playing!!");
		} else if (ans.equalsIgnoreCase("Y") || ans.equals("")) {
			Game();
		} else if (!(ans.equalsIgnoreCase("N")) ) {
			System.out.println("I'm sorry, I didn't understand that.");
			PlayAgain();
		}
		
	}

}

	