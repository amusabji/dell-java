
public class SousChef extends Chef {
	public int choppingSpeed;
	
	public SousChef(String chefName, String chefRestaurant, int experience, int choppingSpeed) {
		super(chefName, chefRestaurant, experience);
		this.choppingSpeed = choppingSpeed;
	}
	
	public void increaseSpeed() {
		choppingSpeed++;
	}
	
	public void printDescription() {
		
	}
}


