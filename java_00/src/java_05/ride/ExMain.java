package java_05.ride;

public class ExMain {

	public static void main(String[] args) {

		Ride ride = new Ride();
		
		ride.move();
		
		ride.moveRide(new Airplan());
		ride.moveRide(new Bus());
		ride.moveRide(new Bike());
		ride.moveRide(new Cycle());
		ride.moveRide(new Ship());

	}

}
