// this is the library to 'scan' input from the keyboard (basically needed to prompt user for input and then store it to variable)
import java.util.Scanner;
import java.util.Random;
// this is a main class
public class RockPaperScissors {
	// this is the main method that is absolutely needed to run code in Java... without this, code will NOT run
	public static void main(String[] args) {
		// output to screen: "Hello World!"
		System.out.println("hello World!");		
		// ask for user input and store in var
		String usersHand = getUsersHand();
		// randomize, return and store Computers Hand
		String compsHand = getComputersHand();
		// determining who wins, user or computer
		// is this recursive? 
		determineWinner(usersHand, compsHand);
	}
	
	public static String getUsersHand() {
		// asking user for input
		System.out.println("Please select 'rock', 'paper' or 'scissors'!");
		//read the input of the user
		Scanner reader = new Scanner(System.in);
		//place the input of the user into a variable
		String usersInput = reader.next();
		// close the reader
		reader.close();
		// ***PROJECT REQUIREMENT: print out User's hand to screen*** 
		System.out.println("You chose " + usersInput + ",");
		return usersInput;
	}
	
	public static String getComputersHand() {
		// randomizer
		Random randNum = new Random();
		// randomly selects a number between 0-2
		int num = randNum.nextInt(3);
		//initializing/declaring variable
		String computersChoice;
		// mapping the random number generated to rock/paper/scissor
		if (num == 0) {
			computersChoice = "rock";
		} else if (num == 1) {
			computersChoice = "paper";
		} else {
			computersChoice = "scissors";
		}
		// ***PROJECT REQUIREMENT: print out Computer's hand to screen*** 
		System.out.println("the Computer chose " + computersChoice + ",");
		return computersChoice;
	}
	
	public static void determineWinner(String user, String comp) {
	  /* *System.out.println(variable.equals(word));*  
	   * ^--> This is what Kevin taught us to use to check for equality of 
		 two different data type variables.. */
		
		//local variables for easier comparison
		String r = "rock";
		String p = "paper";
		String s = "scissors";
		
		/////////////////////////////
		//  CONDITIONAL OPERATORS  //
		/////////////////////////////
		
		// comparing the User's & Computer's hands:
		
		//user wins:
		if ( 
			(user.equals(r) && comp.equals(s)) ||
			(user.equals(p) && comp.equals(r)) ||
			(user.equals(s) && comp.equals(p))
		) 
		{
			System.out.println(user + " beats " + comp + ",");
			System.out.println("You've beat the Computer, Congrats! You win!");
			
		//Computer wins	
		} else if (  
			user.equals(s) && comp.equals(r) ||
			user.equals(r) && comp.equals(p) ||
			user.equals(p) && comp.equals(s)
			) 
		{
			System.out.println(comp + " beats " + user + ",");
			System.out.println("The Computer takes home this victory, better luck next time..");
		
		//Draw	
		} else if (user.equals(comp)) {  
			System.out.println("both players have selected " + user + ",");
			System.out.println("it's a draw!");
		
		//quick and dirty error handler
		} else { 
			System.out.println("oops, something went wrong.. now I go bye-bye..");
		}
	}
}