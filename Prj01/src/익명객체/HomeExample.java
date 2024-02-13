package 익명객체;

public class HomeExample {
	public static void main(String[] args) {
		Home home = new Home();
		
		home.use1();
		home.use2();
		
		home.use3(new Remote() {
			
			@Override
			public void turnOn() {
				System.out.println("난방 켬");
			}
			
			@Override
			public void turnOff() {
				System.out.println("난방 끔");
			}
	
			
		});
	}
	
}
