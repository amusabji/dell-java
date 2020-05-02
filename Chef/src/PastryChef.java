
public class PastryChef extends Chef {

	public int numDessertsBaked;
	
	public PastryChef(String chefName, String chefRestaurant, int experience) {
		super(chefName, chefRestaurant, experience);
		numDessertsBaked = 0;
	}
	
	public void bakeDessert() {
		numDessertsBaked++;
	}
	
	public void printDescription() {
		super.printDescription();
		System.out.println("They're also ");
	}
}

