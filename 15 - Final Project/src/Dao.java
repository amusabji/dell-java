import java.util.ArrayList;

	/* Same as Timesheet class from assessment */ 

public class Dao {
	// Attributes
	public ArrayList<ToDoItem> toDo;

	
	// Constructor
	public Dao() {
		toDo = new ArrayList<ToDoItem>();
	}
	
	// Methods
	
	// find Item object by user inputed ID - returns null if no such object
	public ToDoItem getItemByID(int UsersQueryID) {
		for (ToDoItem item : toDo) {
			int idx = item.getID();
			if (idx == UsersQueryID) {
				return item;
			}
		}
		return null;
	}
	
	// updates specific to-do item to completed via ID
	public void update(int ID) {
		ToDoItem item = getItemByID(ID);
		item.updateCompletedFlag();
	}
	
	public void add(String task) {		
		ToDoItem newTask = new ToDoItem(task);
		toDo.add(newTask);
	}
	
	public void delete(int ID) {
		ToDoItem item = getItemByID(ID);
		toDo.remove(item);
	}
	
	public ArrayList<ToDoItem> list() {
		return toDo;
	}
}
