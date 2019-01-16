import java.util.Arrays;
import java.util.Scanner;

public class Statistics {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hello = userInput();
		
		Integer[] test = numToStringParser(hello);
		
//		System.out.println(Arrays.toString(test));
		
		System.out.println(Arrays.toString(findMaxMin(test)));
		reader.close();
	}
	
	public static String[] userInput() {
		// asking user for input
		System.out.println("Give me a comma seperated list of numbers, no spaces or decimals!!!!!!");
		//place the input of the user into a variable
		String stringOfNums = reader.nextLine();
		//TODO: error handling for bad input data
		String[] arrOfStrNums = stringOfNums.split(",");
		return arrOfStrNums;
	}
	
	public static Integer[] numToStringParser(String[] strArr) {
		Integer[] intArr = new Integer[strArr.length];
		for (int i=0; i<strArr.length; i++) {
			Integer num = Integer.parseInt(strArr[i]);
			intArr[i] = num;
		}
		return intArr;
	}
//	[1,2,7,3,9,0,5,-1]
	public static Integer[] findMaxMin(Integer[] intArr) {
		int maxNum = intArr[0];
		int minNum = maxNum;

		for (int i=1; i<intArr.length; i++) {
			if (intArr[i] > maxNum) {
				maxNum = intArr[i];
			} else if (intArr[i] < minNum) {
				minNum = intArr[i];
			}
		}
		Integer[] maxMin = {maxNum,minNum};
		return maxMin;
	}

}
