import java.util.ArrayList;
import java.util.List;

public class Timesheet {
	// Attributes
	private List<TimesheetEntry> database;
	
	
	// Constructor
	public Timesheet() {
		database = new ArrayList<>();
	}
	
	// Methods
	public void add(String project, String task) {
		TimesheetEntry newtimesheetentry = new TimesheetEntry(project, task);
		database.add(newtimesheetentry);
	}
	
	public List<TimesheetEntry> list() {
		return database;
	}
	
}	