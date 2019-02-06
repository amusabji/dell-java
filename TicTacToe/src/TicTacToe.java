import java.util.*;
public class TicTacToe {
	
	public static Scanner reader = new Scanner(System.in);
	
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
			int rowAndColumnArr =  userInput();
			boolean validMove = validateInput(board, rowAndColumnArr);
			while (validMove == false) {
				System.out.println("Error: Invalid move - position occupied, please try again.");
				rowAndColumnArr =  userInput();
				validMove = validateInput(board, rowAndColumnArr);
			}
			board[rowAndColumnArr] = currentPlayer; //clean this by making a setter/getter for board?
			
			numTurns++;
			printBoard(board);
			
			gameOver = terminateGame(board, currentPlayer, numTurns); //problem doing this first, then switch player: switch player will still run 
			if (gameOver == false) {
				currentPlayer = currentPlayer(currentPlayer); //put inside determineWin() or switch player ??
			}
		}
		reader.close();
	}
	
	// validate that spot is not already taken
	public static boolean validateInput(char[] board, int userPosition) {
		// if spot is empty, you are good to go.
		if (board[userPosition] == ' ') 
		{
			return true;
		}
		return false;
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
	
	public static int userInput() {
		
//		System.out.println("Mark your territory and claim your land!");
		System.out.println("enter a number [1-9]:");
		int spot = reader.nextInt();
		return spot-1;
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
