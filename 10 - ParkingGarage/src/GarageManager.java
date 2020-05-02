
public class GarageManager {

	public static void main(String[] args) {
		
		// instantiating a few garages
		ParkingGarage theDomain = new ParkingGarage(5);
		ParkingGarage woodfieldMall = new ParkingGarage(10);
		ParkingGarage highlandMall = new ParkingGarage(7);
		
		Car dadsCorvette = new Car("red", "Chevy", "Corvette", 8976546);
		Car soccerMomsMinivan = new Car("beige", "Nissan", "Quest", 3214876);
		Car sistersBeetle = new Car("yellow", "Volkswagen", "Beetle", 1459754);
		Car brothersSleeper = new Car("black", "Honda", "Civic", 3748618);
		Car unclesLambo = new Car("orange", "Lamborghini", "Aventador", 1598654);
		Car myWannaBeTesla = new Car("grey", "Toyota", "Prius", 7854123);
		
		// Instantiating some cars
		woodfieldMall.park(unclesLambo, 0);
		theDomain.park(dadsCorvette, 3);
		woodfieldMall.park(soccerMomsMinivan, 1);
		highlandMall.park(myWannaBeTesla, 0);
		theDomain.park(brothersSleeper, 3);
		woodfieldMall.park(sistersBeetle, 11);
		theDomain.vacate(4);
		woodfieldMall.park(sistersBeetle, 1);
		woodfieldMall.vacate(0);
		highlandMall.park(unclesLambo, 7);
		
		// Printing stuff to console
		System.out.println();
		System.out.println();
		
		System.out.println("***********************************************");
		System.out.println("Highland Mall's Parking Garage Status Report:");
		System.out.println("-----------------------------------------------");	
		highlandMall.printInventory();
		
		System.out.println("***********************************************");
		System.out.println("The Domain's Parking Garage Status Report:");
		System.out.println("-----------------------------------------------");
		theDomain.printInventory();
		
		System.out.println("***********************************************");
		System.out.println("Woodfield Mall's Parking Garage Status Report:");
		System.out.println("-----------------------------------------------");
		woodfieldMall.printInventory();
		
		
	}

}
