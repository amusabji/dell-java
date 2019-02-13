public interface Rentable {
   ////Attributes
	
   ////Methods
	// returns description of the item
	public String getDescription();
	// returns the daily rate for renting an item
	public double getDailyRate();
	//returns amount due (price) for renting item
	public double getPrice(double days);
}	
