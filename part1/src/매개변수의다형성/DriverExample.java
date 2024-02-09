package 매개변수의다형성;

public class DriverExample {
	public static void main(String[] args) {
		Driver D = new Driver();
		
		Bus B = new Bus();
		Taxi T = new Taxi();
		
		D.drive(B);
		D.drive(T);
	}

}
