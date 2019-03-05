import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

   public static void main(String args[]) throws IOException {
      BufferedReader in = null;
      ArrayList<String> dictionary = new ArrayList<>();
      Random rand = new Random();
      String guessMe = null;
      
      try {
         in = new BufferedReader(new FileReader("words_alpha.txt"));
//         out = new BufferedWriter(new FileWriter("output.txt"));

         String line;
         while ((line = in.readLine()) != null) {
            dictionary.add(line);
         }
         int r = rand.nextInt(dictionary.size());
         guessMe = dictionary.get(r);
      } finally {
    	  
         // Close input and output streams
         if (in != null) {
            in.close();
         }
      }
      
      char[] play = guessMe.toCharArray();
      char hide[] = new char[play.length];
      System.out.println(hide);
      
      for (int i=0; i<play.length;i++) {
    	  hide[i] = '-';
      }
      System.out.print(hide);
      System.out.println();
      System.out.println();
      
      System.out.println("guess the word!");
      Scanner input = new Scanner(System.in);
//      int correctGuess = 0;
//      int guessCount = 0;
      boolean won = false;
      while (won == false) {
    	  String userGuessStr = input.nextLine();
          char userGuessChar = userGuessStr.charAt(0);
//          guessCount++;
          if (guessMe.contains(userGuessStr)) {
	    	  for(int i=0;i<play.length;i++) {
	    		  if(play[i] == userGuessChar) {
	    			  hide[i] = userGuessChar;
	    			  if(i==play.length-1) {
	    				  System.out.println(hide);
	    			  }
//	    			  if (correctGuess == play) { // gotta fix this..
	    				  won = true;
	    			  }    			  
	    		  }
	    	  }
          }
      }
      input.close();
   }
}