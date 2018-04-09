/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Apr 2018
 * This program tests the vehicle subclasses
 *
 ****************************************************************************/

public class Main {
	
	public static void main(String[] args) throws Exception {
		//Instantiate four vehicles with different constructors
		
		System.out.println("Bike1");
		Bike bike1 = new Bike(Bike.Colours.RED);
		bike1.setCadence(9999);
		System.out.println(bike1.getStatus());
		
		System.out.println("\nBike2");
		Bike bike2 = new Bike(Bike.Colours.RED, 200);
		bike2.setCadence(9999);
		System.out.println(bike2.getStatus());
		
		System.out.println("\nTruck1");
		Truck truck1 = new Truck("BBBB445", Truck.Colours.WHITE);
		System.out.println(truck1.getStatus());
		
		System.out.println("\nTruck2");
		Truck truck2 = new Truck("BBBB445");
		System.out.println(truck2.getStatus());
	}
}