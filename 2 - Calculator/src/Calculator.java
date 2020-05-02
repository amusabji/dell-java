import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("This is a Calculator!\r\n"
				+ "Given two whole numbers (no decimals), I can return:\r\n"
				+ "the sum, difference, product & quotient!"
				+ " \r\nTry me!");
		System.out.println("Please enter in your first whole number: ");
		// read the input of the user
		Scanner reader = new Scanner(System.in);
		// place the input of the user into a variable
		int a = reader.nextInt();
		System.out.println("Thanks! Now enter in your second whole number: ");
		int b = reader.nextInt();
		// closes scanner
		reader.close();
		// calculates and prints returned value
		System.out.println("Sum: " + getSum(a,b));
		System.out.println("Difference: " + getDiff(a,b));
		System.out.println("Product: " + getProduct(a,b));
		System.out.println("Quotient: " + getQuotient(a, b));
	}
	
	public static int getSum(int n1, int n2) {
		// returns sum of 2 numbers
		return n1+n2;
	}
	
	public static int getDiff(int n1, int n2) {
		// returns difference of 1st num against 2nd num
		return n1-n2;
	}
	
	public static int getProduct(int n1, int n2) {
		// returns product of 2 nums
		return n1*n2;
	}
	
	public static float getQuotient(int n1, int n2) {
		// stores int as float
		float number1 = n1;
		float number2 = n2;
		// finds quotient
		float quotient = number1/number2;
		// returns quotient
		return quotient;
	}
}
