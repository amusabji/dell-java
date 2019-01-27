import java.time.*;

public class DriversLicense {
	
	// --------------------------------------------------------- //
	// 
	//	* * * * * * * * * * * Attributes * * * * * * * * * * * * //
	// 
	// --------------------------------------------------------- //
	String firstName;
	String lastName;
	LocalDate DOB;
	int heightInInches;
	String gender;
	
	
	// --------------------------------------------------------- //
	// 
	//	* * * * * * * * * * * Constructor * * * * * * * * * * *  //
	// 
	// --------------------------------------------------------- //
	
	public DriversLicense() {
		
	}
	
	
	
	
	
	
	
	// --------------------------------------------------------- //
	// 
	//	* * * * * * * * * * * Methods * * * * * * * * * * * * *  //
	// 
	// --------------------------------------------------------- //	
	
	
					// 		-------------
					// 		** GETTERS **
					// 		-------------
	
	// returns fullname and Age in years
	public String getNameAndAge() {
		return ("Full name: " + firstName + " " + lastName + "\r\nAge: " + getAge());
	}
	
	
	public String getFullName() {
		return (firstName + " " + lastName);
	}
	
	public int getAge() {
		return (Period.between(DOB, LocalDate.now()).getYears());
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	// returns heights after parsing inches into Feet + Inche's
	public int getHeightInInches() {
		return heightInInches;
	}

	public String getGender() {
		return gender;
	}	
	
					// 		-------------
					// 		** SETTERS **
					// 		-------------
	
	// sets FIRST Name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// sets LAST Name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// sets Date Of Birth using LocalDate MM DD YYYY format
	public void setDOB(int month, int day, int year) {
		DOB = LocalDate.of(year, month, day);
	}

	// sets height in INCHES
	public void setHeightInInches(int height) {
		this.heightInInches = height;
	}

	// sets gender
	public void setGender(String gender) {
		this.gender = gender;
	}

}
