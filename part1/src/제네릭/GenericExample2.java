package 제네릭;

public class GenericExample2 {
	public static void main(String[] args) {
		HOmeAgency ha = new HOmeAgency();
		Home home = ha.rent();
		home.turnon();
		
		carAgency ca = new carAgency();
		Car car = ca.rent();
		car.run();
	}

}
