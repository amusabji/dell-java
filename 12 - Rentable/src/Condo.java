
public class Condo implements Rentable {
	//Attributes
	public double weeklyRate;
	//Optional Attributes
	public String name;
	
	public Condo(String condoName, double weeklyRate) {
		this.name = condoName;
		this.weeklyRate = weeklyRate;
	}
	
	public String getDescription() {
		return name;
	}
	
	public double getDailyRate() {
		return weeklyRate;
	}
	
	public double getPrice(double days) {
		return weeklyRate * days/7;
	}
}
	

