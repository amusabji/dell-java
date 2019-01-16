package test;

public class Strings {
  public static void main(String args[]) {

    // Create a String object using a constructor method
    char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' };
    String helloString = new String(helloArray);  
    System.out.println( helloString );

    // Create a String object using a string literal
    String goodbyeString = "Goodbye!";
    System.out.println( goodbyeString );

  }
}