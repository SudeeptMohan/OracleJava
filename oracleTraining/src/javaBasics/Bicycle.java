package javaBasics;

public class Bicycle {

	int cadence;
	int speed;
	int gear;
	
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		cadence = startCadence;
		speed = startSpeed;
		gear = startGear;
	}
	
	public void changeCadence(int newValue)
	{
		cadence = newValue;
	}
	
	public void changeGear(int newValue)
	{
		gear = newValue;
	}
	
	void speedUp(int increment)
	{
			speed += increment;
	}
	void applyBrakes(int decrement)
	{
		speed += decrement;
	}
	void printStates() {
		
		System.out.println("cadence:"+cadence+" speed:"+speed+" gear:"+gear);
	}
	
	
}
