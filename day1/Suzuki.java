package week3.day1;

public class Suzuki extends Bike {
	public void noOfSeat() {
		System.out.println("My Vehicle is 6 seater");
	}
public static void main(String[] args) {
	Suzuki myVehicle = new Suzuki();
	myVehicle.noOfSeat();
	myVehicle.applyBrake();
	myVehicle.noOfWheels();
} 
}
