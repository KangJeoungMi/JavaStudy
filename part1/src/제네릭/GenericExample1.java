package 제네릭;

public class GenericExample1 {
	public static void main(String[] args) {
		product<TV, String>product1 = new product<>();
		
		product1.setkind(new TV());
		product1.setmodel("스마트 TV");
		
		TV tv = product1.getkind();
		String tvModel = product1.getModel();
		
		product<Car,String> product2 = new product<>();
		
		product2.setkind(new Car());
		product2.setmodel("SUV 자동차");
		
		Car car = product2.getkind();
		String carModel = product2.getModel();
		
	}

}
