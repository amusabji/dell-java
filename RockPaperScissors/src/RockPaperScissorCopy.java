// this is the library to 'scan' input from the keyboard (basically needed to prompt user for input and then store it to variable)
import java.util.Scanner;
import java.util.Random;

// this is a main class
public class RockPaperScissorCopy {
	

	// this is the main method that is absolutely needed to run code in Java... without this, code will NOT run
	public static void main(String[] args) {

		// output to screen: "Hello World!"
		System.out.println("hello World!");
		// asking user for input
		System.out.println("Please select 'rock', 'paper' or 'scissors'!");
		//read the input of the user
		Scanner reader = new Scanner(System.in);
		//place the input of the user into a variable
		String usersHand = reader.next();
		reader.close();
		//TODO: verify user picked something valid
		System.out.println("You chose " + usersHand + ",");
		
//		readUsersHand();
		
//		randomizeComputersHand();
		
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
		System.out.println("the Computer chose " + computersHand);
		
		// determining who wins, user or computer
		// is this recursive? 
		determineWinner(usersHand, computersHand);
		
	}

//	public static String readUsersHand() {
//		// asking user for input
//		System.out.println("Please select 'rock', 'paper' or 'scissor'!");
//		//read the input of the user
//		Scanner reader = new Scanner(System.in);
//		//place the input of the user into a variable
//		String usersHand = reader.next();
//		reader.close();
//		//TODO: verify user picked something valid
//		System.out.println("You chose " + usersHand + ",");
//		return usersHand;
//	}

//	public static String randomizeComputersHand() {

//		if (computersHandNum == (int)computersHandNum) {
//			return computersHand;
//		}
//		else { 
			//randomly generate another hand to play against
//			Random randNum = new Random();
//			int computersHandNum = randNum.nextInt(3);
//			
//			//initializing/declaring variable
//			String computersHand;
//			// mapping the randomizer to rock/paper/scissor
//			if (computersHandNum == 0) {
//				computersHand = "rock";
//			} else if (computersHandNum == 1) {
//				computersHand = "paper";
//			} else {
//				computersHand = "scissor";
//			}
//			System.out.println("the Computer chose " + computersHand);
//			return computersHand;
////		}
//		
//	}	
	
	public static void determineWinner(String user, String comp) {
	  /* *System.out.println(variable.equals(word));*  <-- This is what Kevin taught us to use to check for equality of 
		 two different data typed variables.. */
		
		//local variables for easier comparison
		String r = "rock";
		String p = "paper";
		String s = "scissors";
		
		if ( //user wins:
				
			(user.equals(r) && comp.equals(s)) ||
//			(user == r && comp == s) || 
			(user.equals(p) && comp.equals(r)) ||
//			(user == p && comp == r) || 
			(user.equals(s) && comp.equals(p))
//			(user == s && comp == p)
		) 
		{
			System.out.println("You've beat the Computer, Congrats! You win!");

		} else if (  //Computer wins
			user.equals(s) && comp.equals(r) ||
//			((user == s) && (comp == r)) || 
			user.equals(r) && comp.equals(p) ||
//		    ((user == r) && (comp == p)) || 
			user.equals(p) && comp.equals(s)
//		    ((user == p) && (comp == s))
			) 
		{
			System.out.println("The Computer takes home this victory, better luck next time..");
			
		} else if (user.equals(comp)) { //Draw  
			System.out.println("it's a draw!");
		} else { //quick and dirty error handler
			System.out.println("oops, something went wrong.. now I go bye-bye..");
		}
		
	}
	
}

























