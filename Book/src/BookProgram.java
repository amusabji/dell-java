
public class BookProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book firstBook = new Book();
		firstBook.setAuthorFirstName("Abbas");
		firstBook.setAuthorLastName("Musabji");
		firstBook.setTitle("How to not code in Java");
		System.out.println("My first book: '" + firstBook.getTitle() + "', by " + firstBook.getAuthorFullName());
	
		Book myBook = new Book("Don't read", "Joe", "Schmoe");
		System.out.println(myBook.title);
		System.out.println(myBook.getAuthorFullName());
	}

}
