
public class ToDoItem {
	
	/* Same as TimesheetEntry class from assessment */ 
	
	// Attributes
	private int id;
	private String description;
	private Boolean isCompletedFlag;
	
	private static int NEXTID = 1;
	
	// Constructors
	public ToDoItem(String myDescription) {
		description = myDescription;
		isCompletedFlag = false;
		this.id = NEXTID;
		NEXTID++;
	}
	
	// Methods
	public int getID() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Boolean getCompleted() {
		return isCompletedFlag;
	}
	
	public void updateCompletedFlag() {
		this.isCompletedFlag = true;
	}
	
}
