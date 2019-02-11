
public class Chef {

	//Attributes
	public String name;
	public String restaurant;
	public int yearsExperience;
	public int numDishesCooked;
	
	public Chef(String chefName, String chefRestaurant, int experience) {
		name = chefName;
		restaurant = chefRestaurant;
		yearsExperience = experience;
		numDishesCooked = 0;
	}
	
	public final String getFirstDesh() {
		return "scrambled eggs";
	}
	
	public void cookDish() {
		numDishesCooked++;
	}
	
	public void increaseExperience() {
		yearsExperience++;
	}
	
	public void changeEmployer(String newRestaurant) {
		restaurant = newRestaurant;	
	}
	
	public void printDescription() {
		System.out.println("");
	}
	
}
