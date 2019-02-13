import javax.naming.NoPermissionException;

public class ParkingGarage {
	
	// Attributes
	public Car[] parkingSpot; 
	
	// Constructor
	public ParkingGarage(int capacity) {
		// initialize array of Car with capacity
		parkingSpot = new Car[capacity];
	}
	
	
	// Methods
	
	// method to park car
	public void park(Car car, int spot){
		try { // try block to gracefully handle potential errors
			if (parkingSpot[spot] != null) { // check to see if occupied (not empty)
				throw new NoPermissionException("This spot is already occupied, you cannot park here."); // if occupied, u can't park here, throw exception
			}
			parkingSpot[spot] = car; // otherwise, park-it! 
		} catch (ArrayIndexOutOfBoundsException e) { // parking spot don't exist homie dude man
			System.out.println("This spot does not exist."); // see, told ya..
		} catch (NoPermissionException e) { // dude guy man.... someone's already parked here, c'mon!! 
			e.getExplanation(); // see above comment. (see line 21 for english)
		}
	}
	
	// method to vacate parking spot
	public void vacate(int spot) {
		if (parkingSpot[spot] != null) { // check to see if occupied (not empty)
			parkingSpot[spot] = null; //only vacate if currently occupied
		} else { 
			System.out.println("No car is present in that spot."); // otherwise print message to console notifying user spot is empty
		}
	}
	
	// method to print inventory to console
	public void printInventory() {
		for (int i=0; i<parkingSpot.length; i++) { // iterate thru every spot 
			if (parkingSpot[i] != null) { // check if occupied (not empty)
				System.out.println("Parking spot #" + i + // if occupied, print carfax
									"\r\nis currently occupied by a: " + 
									"\r\nColor: " + parkingSpot[i].getColor() + 
									"\r\nMake: " + parkingSpot[i].getMake() + 
									"\r\nModel: " + parkingSpot[i].getModel() + 
									"\r\nLicense Plate: " + parkingSpot[i].getLicenseNum());
				System.out.println("***********************************************");
				System.out.println();
				
			}
		}
	}

}
