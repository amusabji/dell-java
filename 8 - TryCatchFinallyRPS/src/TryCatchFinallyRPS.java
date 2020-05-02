import java.util.Scanner;
//IDE threatened unimaginable consequences if I did not include this, so.... here we are.
import javax.naming.NoPermissionException; 

public class TryCatchFinallyRPS {
	
	// instantiated scanner up here made this easier... I don't think there's anything wrong with that? closed it @ end of main.
	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// initialize current player
		char currentPlayer = 'X';
		
		// initialize array to represent empty board
		char[] board = 
				{' ',' ',' ',
				 ' ',' ',' ',
				 ' ',' ',' '};
		
		// print initial title and empty board
		System.out.println("\r\n     TIC-TAC-TOE!");
		System.out.println(
				"\r\n        " + 1 + "|" + 2 + "|" + 3 +
				"\r\n        -----" +
				"\r\n        " + 4 + "|" + 5 + "|" + 6 +
				"\r\n        -----" +
				"\r\n        " + 7 + "|" + 8 + "|" + 9 +
				"\r\n"
			);
		
		// print initial player
		System.out.println("Current Player: X");
		
		// initialize turn number to use for draw end game
		int numTurns = 0;
		
		// while loop to continue game until game terminates
		boolean gameOver = false;
		while (gameOver == false) {	
			// while loop to check for correct valid position (spot not taken)
			boolean validMove = false;
//			int usersMove = -1;
			String usersMoveStr = null;
			while (validMove == false) {
				
				try { // test to see if user input is valid ( 1 < int < 9 )
					// while loop to check for valid input type (int && value)
					boolean validType = false;
					while (validType == false) {
						
						try { // nested try to validate input type first, then input position
							usersMoveStr = userInput();
							validType = validateInputType(usersMoveStr);
						} catch (ArrayIndexOutOfBoundsException e) { // check for number outside of 1-9
							System.out.println(e.getMessage());
							System.out.println("You must pick a number between 1-9");
						} catch (NumberFormatException e) { // check for int vs string
							System.out.println(e.getMessage());
							System.out.println("Error: Invalid input - '" + usersMoveStr + "' is not a valid input type.");
							System.out.println("Input type must be an Integer");
						}
						
					}
					validMove = validateInputPlace(board, usersMoveStr); //validate input position
			    } catch (NoPermissionException e) { // position already filled
			    	System.out.println(e.getExplanation());
				} catch (Exception e) { // in case something doesn't get captured, doubt this will be used, but just in case...
					System.out.println("Error: Something went wrong - " + e.toString()); 
					System.out.println(e.getMessage());
				}
			}
			int usersMoveInt = Integer.parseInt(usersMoveStr); // parse user input (string) to int 
			int usersMove = usersMoveInt - 1; // minus 1 for index
	    	board[usersMove] = currentPlayer; // assign symbol to board where user places move
			numTurns++; // keep track of how many turns it has been.
			printBoard(board); // print new board with current symbols
			gameOver = terminateGame(board, currentPlayer, numTurns); // determine if game is over 
			if (gameOver == false) { // if game is NOT over, switch player symbols
				currentPlayer = currentPlayer(currentPlayer); // switch symbols
			}
		}
		reader.close(); // close reader, last instructions of main
	}
	
	// validate that spot is not already taken
	public static boolean validateInputPlace(char[] board, String userPositionStr) throws NoPermissionException {
		
		int userPositionInt = Integer.parseInt(userPositionStr);
		int usersMove = userPositionInt - 1;
		// if spot is empty, you are good to go (returns true)
		if (board[usersMove] != ' ') 
		{	// if not empty, throw exception.
			throw new NoPermissionException("This spot is already taken, please choose another.");
		}
		return true;
	}
	
	// returns representation of current player, primarily used to switch back and forth between 2 players using same variable name
	public static char currentPlayer(char player) {
		if (player == 'X') {
			player = 'O';
			System.out.println("Current Player: " + player); // prints player 'O'
			return player;
		}
		player = 'X';
		System.out.println("Current Player: " + player); // prints player 'X'
		return player;
	}
	
	// prints current board with filled/empty positions
	public static void printBoard(char[] board) {
		System.out.println(
			"\r\n        " + board[0] + "|" + board[1] + "|" + board[2] +
			"\r\n        -----" +
			"\r\n        " + board[3] + "|" + board[4] + "|" + board[5] +
			"\r\n        -----" +
			"\r\n        " + board[6] + "|" + board[7] + "|" + board[8] +
			"\r\n"
		);
	}
	
	// this was a pita.. switched from returning int to String to capture invalid user input type into exception.
	// surprised (and VERY happy) I managed to make this so short. 
	public static String userInput() {
		System.out.println("enter a number [1-9]:");
		String spotStr = reader.nextLine();		
		return spotStr;
	}	
	
	// also a huge pita, not sure how everything ended up working out so cleanly (if you can call this clean...)
	//		as Bob Ross would put it... it was a happy accident. :)
	public static boolean validateInputType(String x) throws ArrayIndexOutOfBoundsException, NumberFormatException{
		int xInt; // hate the fact that I had to do this same exact logic in 3 different places, I can probably refactor `
		try {	  // but heck no I am not going down any more rabbit holes today, got everything working without even any `
			xInt = Integer.parseInt(x); // warnings so I am calling it a victory and heading home. dueces.
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid input - '" + x + "' is not a valid input type.");
			return false;
		}
		if (xInt < 1 || xInt > 9) {
			throw new ArrayIndexOutOfBoundsException("Error: Invalid number selected - You've selected: '" + xInt + "'");
//			return false; // can't reach any code after throwing an exception.. hmm... whodathoughtit
		}
		return true;
	}
	
	// method to bruteforce win combos.. could be more elegant but whatever man, learned my lesson from last time in js to not go `
	// down this rabbit hole.. if it works it works..
	public static boolean terminateGame(char[] board, char player, int score) {
		int[][] winningCombos = {
				{0,1,2},
				{3,4,5},
				{6,7,8},
				{0,3,6},
				{1,4,7},
				{2,5,8},
				{0,4,8},
				{6,4,2}				
		};
		for (int i = 0;i<winningCombos.length;i++) {
			if (((board[winningCombos[i][0]] == board[winningCombos[i][1]]) && 
				(board[winningCombos[i][1]] == board[winningCombos[i][2]])) && 
				(board[winningCombos[i][0]] == player))
			{
				System.out.println("Congrats, Player " + player + ", wins!");
				return true;
			} 
		}
		if (score == 9) { // if number of turns reaches 9 without a win, it's a draw..
			System.out.println("It's a draw!");
			return true;
		}
		return false; // if none of the above, game goes on.
	}
}