package 익명객체;

public class Home {
	private Remote re = new Remote() {
		public void turnOn() {
			System.out.println("TV 켬");
		}
		
		public void turnOff() {
			System.out.println("TV 끔");
		}
	};
	
	public void use1() {
		re.turnOn();
		re.turnOff();
	}
	
	public void use2() {
		Remote re = new Remote() {
			
			@Override
			public void turnOn() {
				System.out.println("에어컨 켬");
			}
			
			@Override
			public void turnOff() {
				System.out.println("에어컨 끔");
			}
		};
			re.turnOn();
			re.turnOff();;
	}
	public void use3(Remote re) {
		re.turnOn();
		re.turnOff();
	}
	
	
}
