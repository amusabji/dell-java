import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hi, I am Abbas, what is your name?");
		// need this to read user-generated input
		Scanner reader = new Scanner(System.in);
		// saving user-generated input to be used later
		String input = reader.nextLine();
		// printing out to console custom text + user-generated input
		System.out.println("Hi " + input + ", hope you are doing well.");
		// we no longer need to catch user-generated input, so we close the reader
		reader.close();
	}

}
