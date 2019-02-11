import java.util.*;

public class Roster {
	// Attributes
	private List<Employee> roster;
	
	
	// Constructor
//	private Roster() {
//		roster = new ArrayList<>();
//	}
	
	// Methods
	public void setRoster(List<Employee> roster) {
		this.roster = roster;
	}
	
	public List<Employee> getRoster() {
		return roster;
	}
	
	public void addEmployee(Employee toAdd) {
		roster.add(toAdd);
	}
}
