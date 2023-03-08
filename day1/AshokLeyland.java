package week3.day1;

public class AshokLeyland extends Truck {
	
  public void noOfGlass() {
	System.out.println("My Truck has 2 glass");

}
public static void main(String[] args) {
	AshokLeyland mycar = new AshokLeyland();
	mycar.applyBrake();
	mycar.soundHorn();
	mycar.noOfGlass();
}
}
