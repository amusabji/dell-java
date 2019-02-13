import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Gradebook { // Gradebook assignment to learn about Collections I guess
	
	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the number of students in the gradebook: ");
		int students = userInputInt();
		
		Map<String, String> studentEntry = new HashMap<>(students);
		
		for (int i=0; i<students; i++) {
			int j = i+1; // just for clean console output
			System.out.println("please enter name and grade for Student" + j + ": ");
			String student = userInputStr();
			String[] studentArr = stringParser(student);
			studentEntry.put(studentArr[0], studentArr[1]);
		}
		System.out.println();
	}
	
	public static int userInputInt() {
		String inputStr = reader.nextLine();
		int input = Integer.parseInt(inputStr);
		return input;
	}
	
	public static String userInputStr() {
		String input = reader.nextLine();
		return input;
	}
	
	public static String[] stringParser(String entry) {
		String[] entryArr = entry.split(",");
		return entryArr;
	}
}
