public class Book {
	
	//Attributes
	String title;
	String authorFirstName;
	String authorLastName;
	
	//Constructor
	public Book() {
		
	}
	
	public Book (String title, String firstName, String lastName) {
		this.title = title;
		authorFirstName = firstName;
		authorLastName = lastName;
	}
	
	//Methods
	
	//print Author's Full Name
	public String getAuthorFullName() {
		return authorFirstName + " " + authorLastName;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthorFirstName() {
		return authorFirstName;
	}
	
	public void setAuthorFirstName(String FirstName) {
		this.authorFirstName = FirstName;
	}
	
	public String getAuthorLastName() {
		return authorLastName;
	}
	
	public void setAuthorLastName(String LastName) {
		this.authorLastName = LastName;
	}
	
	
	
}
