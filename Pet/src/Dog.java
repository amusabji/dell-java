
public class Dog implements Pet{
	
	public String dogName;
	public String breed;

	public Dog(String name, String breed) {
		this.dogName = name;
		this.breed = breed;
	}
	
	public String getName() {
		return dogName;
	}
	
	public void setName (String name) {
		this.dogName = name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String speak() {
		return "woof";
	}
	
}
