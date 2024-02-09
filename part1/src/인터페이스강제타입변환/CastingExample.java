package 인터페이스강제타입변환;

public class CastingExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
	}
}
