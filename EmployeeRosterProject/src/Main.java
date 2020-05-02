import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Roster myRoster = new Roster();
		Scanner reader = new Scanner(System.in);
		
		Employee abbas = new Employee("Abbas", "student");
		
		boolean quit = false;
		
		while(!quit) {
			//Tell user their options
			System.out.println("Command options: add, list, quit");
			String input = reader.nextLine();
			String[] inputParts = input.split(" ");
			String firstCmd = inputParts[0];
			if (firstCmd.equals("add")) {
				System.out.println("Please enter your name: ");
				String employeeName = reader.nextLine();
				System.out.println("Please enter your title: ");
				String employeeTitle = reader.nextLine();
			
				Employee newHire = new Employee(employeeName, employeeTitle);
				myRoster.addEmployee(newHire);
			} else if (firstCmd.equals("list")) {
				printRoster(myRoster);
			} else if (input.equals("quit")) {
				quit = true;
			} else {
				System.out.println("Invalid input, please try again!");
			}
		}
		
//		reader.close();
	}
	
	private static void printRoster(Roster myRoster) {
		List<Employee> roster = myRoster.getRoster();
		for (int i = 0; i < roster.size(); i++) {
			Employee currEmp = roster.get(i);
			System.out.println("Id: " + currEmp.getId()
							+ ", Name: " + currEmp.getName()
							+ ", Title: " + currEmp.getJobTitle());
		}
	}
}
