public class Employee {
	// Attributes
	public String name;
	public String jobTitle;
	private int id;
	public static int NEXTID = 100;
	
	// Constructor
	public Employee(String name, String title) {
		this.name = name;
		jobTitle = title;
		id = NEXTID;
		NEXTID++;
	}

	// Method - just getters and setters for now
	public String getName() {
		return name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
}
