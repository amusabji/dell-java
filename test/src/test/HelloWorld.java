package test;

public class HelloWorld {
	  public static void main(String[] args) {
	    System.out.println("Hello world!");
	    writeText("Hello", "computer");
	  }
	  public static void writeText(String partOne, String partTwo) {
	    // Concatenates the input strings and prints the result
	    System.out.print(partOne + partTwo);
	    // How do we add a space between the two strings?
}
}