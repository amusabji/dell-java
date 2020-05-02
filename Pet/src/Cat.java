
public class Cat implements Pet{
	
	public String catName;
	public int livesRemaining;
	
	
	public Cat(String name) {
		catName = name;
		livesRemaining = 9;
	}
	
	public int getLivesRemaining() {
		return livesRemaining;
	}
	
	public String getName() {
		return catName;
	}
	
	public String speak() {
		return "meow";
	}
	
	public String sleep() {
		return "purrr";
	}
	
}
