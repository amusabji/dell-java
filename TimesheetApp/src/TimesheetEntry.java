import java.time.LocalDateTime;

public class TimesheetEntry {
	
	// Attributes
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	private static int NEXTID = 1;
	
	
	// Constructors
	public TimesheetEntry(String myProject, String myTask) {
		projectName = myProject;
		task = myTask;
		startTime = LocalDateTime.now();
		id = NEXTID;
		NEXTID++;
	}
	
	// Methods
	public void updateEndTime() {
		// do I really need to check whether or not this guy has been initialized yet or not..? hmm...
		if (endTime != null) {
			
		} else {
			endTime = LocalDateTime.now();
		}
	}
	
	// SETTERS Start --
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = LocalDateTime.now();
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	// SETTERS End --
	

	// GETTERS Start --
	public String getProjectName() {
		return projectName;
	}

	public String getTask() {
		return task;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}
		// GETTERS End --
	

}
