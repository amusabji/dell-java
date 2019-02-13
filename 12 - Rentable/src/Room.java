
public class Room implements Rentable {
	//Required Attributes
	public double dailyRate;
	//Optional Attributes
	public String name;
	
	public Room(String roomName, double dailyRate) {
		this.name = roomName;
		this.dailyRate = dailyRate;
	}
	
	public String getDescription() {
		return name;
	}
	
	public double getDailyRate() {
		return dailyRate;
	}
	
	public double getPrice(double days) {
		return dailyRate * days;
	}
}
