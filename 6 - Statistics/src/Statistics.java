import java.util.Scanner;

/********************************************************************************************
 *  					~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  					~ ASSIGNMENT #6: Statistics ~
 *  					~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * 	This program is designed to satisfy the following conditions:
 * 		1) Ask the user for a list of numbers.
 *		2) Accept a comma separated list of numbers.
 *		3) Your program should print out:
 *			- the min
 *			- the max
 *			- the number of elements
 *			- the average
 *			- the sum
 ********************************************************************************************/
public class Statistics {
	

	public static void main(String[] args) {
		// Request user for input:
		System.out.println("Give me a comma seperated list of numbers, no spaces or decimals, please.");
		// Collect said input and store in var.
		String userNums = userInput();
		
		// parse  user's input into an Array of Integers
		Integer[] intArrays = numToStringParser(userNums);
		
		// find the number of elements in the Array of Integers
		int intSize = intArrays.length;
		
		// find the min, max and sum of the Array of Integers
		Integer[] storeResults = findResults(intArrays);
		// store results to variables
		int maxInt = storeResults[0];
		int minInt = storeResults[1];
		int sum = storeResults[2];
				
		// find the avg of all numbers in Array of Integers
		float avg = (float)sum / intSize;
		
		
		// print results:
		System.out.println(						
												"\r\n"
				+ "Results:						 \r\n"
				+ "--------						 \r\n"
				+ "# of Elements: " + intSize + "\r\n"
				+ "min: " 			+ minInt  + "\r\n"
				+ "max: " 			+ maxInt  + "\r\n"
				+ "avg: " 			+ avg 	  + "\r\n"
				+ "sum: " 			+ sum 	  + "\r\n"
		);
		
	}
	
	
	/********************************************************************************************
	 * 	standard boiler plate code for capturing user input by:
	 * 		- instantiating a new Scanner (reader) - remember to import Scanner class!
	 * 		- capturing user input into variable
	 * 		- close Scanner (don't need to delete this if using more than once due to local var)
	 * 		- return user input
	 ********************************************************************************************/
	public static String userInput() {
		Scanner reader = new Scanner(System.in);		
		String userInput = reader.nextLine();
		reader.close();
		return userInput;
	}
	
	/********************************************************************************************
	 * 	Method to parse user-generated String into an Array of Integers
	 * 		- param: String
	 * 		- return: Integer[] 
	 ********************************************************************************************/
	public static Integer[] numToStringParser(String userStr) {
		String[] strArrNum = userStr.split(",");
		Integer[] intArr = new Integer[strArrNum.length];
		for (int i=0; i<strArrNum.length; i++) {
			Integer num = Integer.parseInt(strArrNum[i]);
			intArr[i] = num;
		}
		return intArr;
	}

	/********************************************************************************************
	 * 	Method to find some calculated results of the Integers in the Array:
	 *   - max(largest) 
	 *   - min(smallest) 
	 *   - sum
	 * 		- param: Integer[]
	 * 		- return: Integer[]
	 ********************************************************************************************/
	public static Integer[] findResults(Integer[] intArr) {
		int maxNum = 0;
//		= intArr[0];
		int minNum = 0;
//		= maxNum;
		int sum = 0;

		for (int i=0; i<intArr.length; i++) {
			if (maxNum < intArr[i]) {
				maxNum = intArr[i];
			} else if (minNum > intArr[i]) {
				minNum = intArr[i];
			}
			sum += i; 
		}
		
		Integer[] results = {maxNum,minNum,sum};
		return results;
	}
}
