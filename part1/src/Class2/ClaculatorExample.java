package Class2;

public class ClaculatorExample {
	public static void main(String[] args) {
		Claculator myCalc = new Claculator();
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println(result1);
		
		int x=10;
		int y=4;
		
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
		
		myCalc.powerOff();

		
	}

}
