
public class Tool implements Rentable {
	//Attributes
	public double hourlyRate;
	//Optional Attributes
	public String name;
	
	public Tool(String toolName, double hourlyRate) {
		this.name = toolName;
		this.hourlyRate = hourlyRate;
	}
	
	public String getDescription() {
		return name;
	}
	
	public double getDailyRate() {
		return hourlyRate;
	}
	
	public double getPrice(double days) {
		return hourlyRate * days*24;
	}
}
