 /* Same as Controller class from assessment */ 

public class Controller {
	
	/* Member variables */
	Dao dao;
	ConsoleUtils consoleUtils;
    
    /* Constructor */
    
    public Controller(){
        this.dao = new Dao();
        this.consoleUtils = new ConsoleUtils();
    }

    /* Methods */

	/*
	 * Runs the program
	 */
    public void start() {

        consoleUtils.printHelp(); // Print the action menu

        boolean quit = false;
        while(!quit) {

			// Prompt the user for input, collect input, parse into parts
            String input = consoleUtils.promptString("> ");
            String[] actionParts = input.split(" ");
            String action = actionParts[0].trim(); // Primary action

			// Figure out what to do depending on the user's primary action
            if (action.equals("add")) {

                processAddAction();

            } else if (action.equals("delete")) {

                processDeleteAction(actionParts);

            } else if (action.equals("update")) {

                processUpdateAction(actionParts);

            } else if (action.equals("list")) {

                processListAction(actionParts);

            } else if (action.equals("quit")) {

                // Your code here

            } else if (action.equals("help")) {

            	consoleUtils.printHelp();

            } else if(action.length() ==0 ){
            
                // do nothing.
                
            } else {
            
                // Your code here
                
            }
        }

    }

	/*
	 * The user requested that a given TimesheetEntry be stopped (marked as complete)
	 * This method conveys that request to the Dao
	 */
    public void processUpdateAction(String[] actionParts){

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to stop command");
            return;
        }

        int id = Integer.parseInt(actionParts[1]);

		dao.update(id);
    }

	/*
	 * The user requested that a given ToDoItem be deleted
	 * This method conveys that request to the Dao
	 */
    public void processDeleteAction(String[] actionParts){

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to delete command");
            return;
        }

        int id = Integer.parseInt(actionParts[1]);

		dao.delete(id);
    }

	/*
	 * The user wants to view a list of Dao entries
	 * This method conveys that request to the Dao,
	 * along with any special options (active-only, filter by project name)
	 */
    public void processListAction(String[] actionParts){
    
        if(actionParts.length > 3){
            consoleUtils.error("Too many inputs to list command");
            return;
        }

		consoleUtils.printList(dao.list()); 
    }

	/*
	 * The user wants to add a new entry to the Dao
	 * This method conveys that request to the Dao, along with
	 * the specified project name and task description 
	 */
    public void processAddAction(){
    
//        String project = consoleUtils.promptString("Task Name (one word only):");
//        
//        if (project.split(" ").length > 1) {
//        	consoleUtils.error("Project Name must be ONE word only!");
//            return;
//        }
        
        String description = consoleUtils.promptString("Task:");
        
        dao.add(description);
        
    }
}