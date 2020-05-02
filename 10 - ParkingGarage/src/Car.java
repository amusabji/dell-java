public class Car {
	
	// Attributes
	private String color;
	private int licenseNum;
	private String make;
	private String model;

	// Constructor (basic)
	public Car() {
		
	}
	
	// constructor overload to make it easier to instantiate new cars
	public Car(String color, String make, String model, int licNum) {
		this.color = color;
		this.make = make;
		this.model = model;
		licenseNum = licNum;
	}
	
	// Methods
		// Don't need setters, constructor overloader doing all the setting at time of instantiating
	
	// get color
	public String getColor() {
		return color;
	}
	
	// get license#
	public int getLicenseNum() {
		return licenseNum;
	}

	// get Make of car
	public String getMake() {
		return make;
	}

	// get model of car
	public String getModel() {
		return model;
	}

}
