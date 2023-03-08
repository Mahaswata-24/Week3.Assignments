package week3.day1;

public class Bike extends Vehicle{
	public void noOfWheels() {
		System.out.println("Wheels of my bike is 2");

	}
	public static void main(String[] args) {
		 Bike myBike = new Bike();
		 myBike.applyBrake();
		 myBike.noOfWheels();
	}
  
}
