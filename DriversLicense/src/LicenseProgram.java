public class LicenseProgram {

	public static void main(String[] args) {
		//first instance
		DriversLicense firstPerson = new DriversLicense();
		firstPerson.setDOB(5, 1, 1962);
		firstPerson.setFirstName("Ben");
		firstPerson.setLastName("Jamin");	
		// the "\r\n" is to include a carriage return
		System.out.println("--First Entry-- \r\n" + firstPerson.getNameAndAge() + "\r\n");
		
		//second instance
		DriversLicense secondPerson = new DriversLicense();
		secondPerson.setDOB(11, 15, 1990);
		secondPerson.setFirstName("Santa");
		secondPerson.setLastName("Claus");
		System.out.println("--Second Entry-- \r\n" + secondPerson.getNameAndAge() + "\r\n");
		
		// third instance
		DriversLicense thirdPerson = new DriversLicense();
		thirdPerson.setDOB(9, 20, 1984);
		thirdPerson.setFirstName("Finding");
		thirdPerson.setLastName("Nemo");
		System.out.println("--Third Entry-- \r\n" + thirdPerson.getNameAndAge() + "\r\n");
	}
}
