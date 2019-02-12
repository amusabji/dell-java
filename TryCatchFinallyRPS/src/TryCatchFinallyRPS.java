import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.NoPermissionException;

public class TryCatchFinallyRPS {
	
	
	
	public static void main(String[] args) {
		
		char currentPlayer = 'X';
		char[] board = 
				{' ',' ',' ',
				 ' ',' ',' ',
				 ' ',' ',' '};
		System.out.println("\r\n     TIC-TAC-TOE!");
		System.out.println(
				"\r\n        " + 1 + "|" + 2 + "|" + 3 +
				"\r\n        -----" +
				"\r\n        " + 4 + "|" + 5 + "|" + 6 +
				"\r\n        -----" +
				"\r\n        " + 7 + "|" + 8 + "|" + 9 +
				"\r\n"
			);
		System.out.println("Current Player: X");
		int numTurns = 0;
		boolean gameOver = false;
		while (gameOver == false) {	
			boolean validMove = false;
//			int usersMove = -1;
			String usersMoveStr = null;
			while (validMove == false) {
				
				try { // test to see if user input is valid ( 1 < int < 9 )
					boolean validType = false;
					while (validType == false) {
						
						try {
							usersMoveStr = userInput();
							validType = validateInputType(usersMoveStr);
						} catch (ArrayIndexOutOfBoundsException e) {
							System.out.println(e.getMessage());
							System.out.println("You must pick a number between 1-9");
						} catch (NumberFormatException e) {
							System.out.println(e.getMessage());
							System.out.println("Error: Invalid input - '" + usersMoveStr + "' is not a valid input type.");
							System.out.println("Input type must be an Integer");
						}
						
					}
					validMove = validateInputPlace(board, usersMoveStr);
				} catch (ArrayIndexOutOfBoundsException e){
					System.out.println(e.getMessage());
					System.out.println("You must pick a number between 1-9");
			    } catch (NumberFormatException e) { 
					System.out.println("You must pick a number between 1-9");
			    } catch (NoPermissionException e) {
			    	System.out.println(e.getExplanation());
				} catch (Exception e) { 
					System.out.println("Error: Something went wrong - " + e.toString()); 
					System.out.println(e.getMessage());
			    } finally {
			    	
			    }
//				
//				reader.close();
//				validMove = validateInput(board, usersMove);
			}
			int usersMoveInt = Integer.parseInt(usersMoveStr);
			int usersMove = usersMoveInt - 1;
	    	board[usersMove] = currentPlayer; //clean this by making a setter/getter for board?
			numTurns++;
			printBoard(board);
			
			gameOver = terminateGame(board, currentPlayer, numTurns); //problem doing this first, then switch player: switch player will still run 
			if (gameOver == false) {
				currentPlayer = currentPlayer(currentPlayer); //put inside determineWin() or switch player ??
			}
		}
		
	}
	
	// validate that spot is not already taken
	public static boolean validateInputPlace(char[] board, String userPositionStr) throws NoPermissionException {
		// if spot is empty, you are good to go.
		int userPositionInt = Integer.parseInt(userPositionStr);
		int usersMove = userPositionInt - 1;
		if (board[usersMove] != ' ') 
		{
			throw new NoPermissionException("This spot is already taken, please choose another.");
		}
		return true;
	}
	
	public static char currentPlayer(char player) {
		if (player == 'X') {
			player = 'O';
			System.out.println("Current Player: " + player);
			return player;
		}
		player = 'X';
		System.out.println("Current Player: " + player);
		return player;
	}
	
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
	
	public static String userInput() {
		Scanner reader = new Scanner(System.in);
		System.out.println("enter a number [1-9]:");
		String spotStr = reader.nextLine();		
		return spotStr;
	}	
	
	public static boolean validateInputType(String x) throws ArrayIndexOutOfBoundsException, NumberFormatException{
		int xInt;
		try {
			xInt = Integer.parseInt(x);
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid input - '" + x + "' is not a valid input type.");
			return false;
		}
		if (xInt < 1 || xInt > 9) {
			throw new ArrayIndexOutOfBoundsException("Error: Invalid number selected - You've selected: '" + xInt + "'");
//			return false;
		}
//			if (Integer.parseInt(spot) > 0) {
		return true;
	}
	
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
		if (score == 9) {
			System.out.println("It's a draw!");
			return true;
		}
		
		return false;
	}
	
//	public static int exceptionHandler() {
//		
//	}
	
}




	// in case original gets corrupted and I need this again, saving it here..
//	System.out.println(
//		"\r\n     TIC-TAC-TOE:\r\n" +
//		"\r\n        " + board[0][0] + "|" + board[0][1] + "|" + board[0][2] +
//		"\r\n        -----" +
//		"\r\n        " + board[1][0] + "|" + board[1][1] + "|" + board[1][2] +
//		"\r\n        -----" +
//		"\r\n        " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]
//	);
