import java.util.ArrayList;
import java.util.Scanner;

 /* Same as Controller class from assessment */ 

public class ConsoleUtils {
	
	/* Member variables */
	private Scanner scanner;
    
    /* Constructor */
    
    public ConsoleUtils(){
        scanner = new Scanner(System.in);
    }

	/* Methods */
	
	/*
	 * Prints the menu of actions to the console
	 */
    public void printHelp(){
        System.out.println("Valid commands: ");
        System.out.println("  list [-p|-a]          list entries; pending and/or active flag are optional");
        System.out.println("  add                   add an entry, and set the start time");
        System.out.println("  update ID             update the entry's end time");
        System.out.println("  delete ID             delete entry with the ID");
        System.out.println("  help                  print help");
        System.out.println("  quit                  quit the app");
        System.out.println();

    }

	/*
	 * Prints an informational message to the console
	 */
    public void info(String msg){
        System.out.println("["+msg+"]");
        System.out.println();
    }

	/*
	 * Prints an error message to the console
	 */
    public void error(String msg){
        System.out.println("[ERROR: "+msg+"]");
        System.out.println();
        }

	/*
	 * Prompts the user to enter input
	 * Returns the text entered by the user
	 */
    public String promptString(String label){
        System.out.print(label+" ");
        return scanner.nextLine();
    }

	/*
	 * Prints a list of TimesheetEntry objects in a pretty table
	 */
    public void printList(ArrayList<ToDoItem> entries){
        int longestTask = 4;

        for(ToDoItem entry : entries){
            if(entry.getDescription().length() > longestTask) {
            	longestTask = entry.getDescription().length();
            }
        }
        
        String taskHeader = String.format("%"+longestTask+"s", "Task");
        String taskUnderline = "";
        for(int i=0;i<longestTask;i++){
            taskUnderline+="-";
        }

        System.out.println(" ID | "+taskHeader   +" | Completed ");
        System.out.println("----+-"+taskUnderline+"-+-----------");

        for(ToDoItem entry : entries){
            String task = String.format("%-"+longestTask+"s", entry.getDescription());
            String completed = entry.getCompleted().toString();
            String line = String.format(" %2s | %s | %s ", entry.getID(), task, completed);
            System.out.println(line);
        }

        if(entries.size() == 1){
            System.out.println("[1 entry]");
        } else {
            System.out.println("["+entries.size()+" entries]");
        }

        System.out.println();
    }
}
