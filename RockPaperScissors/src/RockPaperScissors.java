// this is the library to 'scan' input from the keyboard (basically needed to prompt user for input and then store it to variable)
import java.util.Scanner;
// library to generate random numbers
import java.util.Random;

// this is a main *class*
public class RockPaperScissors {
	
	// this is the main *method* that is absolutely needed to run code in Java... without this, code will NOT run
	public static void main(String[] args) {
		System.out.println("hello World!");
		recursiveFinal();	
	}
		
	public static void recursiveFinal() {
		// asking user for input
		System.out.println("Please select 'rock', 'paper' or 'scissors'!");
		//read the input of the user
		Scanner reader = new Scanner(System.in);
		//place the input of the user into a variable
		String usersHand = reader.next();
		reader.close();
		//TODO: error handling for bad input data
		System.out.println("You chose " + usersHand + ",");
		

		System.out.println("the Computer chose " + determineComputersHand() + ",");
		
		// determining who wins, user or computer
		// is this recursive? 
		determineWinner(usersHand, determineComputersHand());
		
		//an if statement that should always been asked at the end of the game if user wants to keep playing
		//* prompt: want to play again? yes or no (boolean)
		//* if yes, just call main() again... (do I need to null any variables..?) 
		//* if no, then print to screen, "toodles" and run **reader.close();**
		System.out.println("Would you like to play again? [y/N] default: yes");
		//start up the Scanner once more to take more input from user
		Scanner reader2 = new Scanner(System.in);
		//place the user input into a variable
		String playAgain = reader2.next();
		//stop accepting user input for now
		reader2.close();
		// unless the user explicitly says NO!, we need to go into some logic
		if (!(playAgain.equalsIgnoreCase("N")) ) {
			letsPlayAgain(playAgain);
		}
		System.out.println("Thanks for playing!!");
	
	}	
	
	public static void letsPlayAgain(String newGame) {
		while (!(newGame.equalsIgnoreCase("n"))) {
			if (newGame.equalsIgnoreCase("y")) {
				// I can't get the below to work (recursively calling main()) so I will try to put it all in a diff method
//				main();
				//lets hope this worked.. I put everything under it's own method called recursiveFinal()
				recursiveFinal();
			} else {
				System.out.println("I'm sorry, I didn't understand that. Would you like to play again? [y/n] default: yes");
				Scanner readerLoop = new Scanner(System.in);
				newGame = readerLoop.next();
				readerLoop.close();
				if (!(newGame.equalsIgnoreCase("N")) ) {
					letsPlayAgain(newGame);
				}
			}
		}
	}
	public static String determineComputersHand() {
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
		return computersHand;
	}
	
	public static void determineWinner(String user, String comp) {
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
	
}

























