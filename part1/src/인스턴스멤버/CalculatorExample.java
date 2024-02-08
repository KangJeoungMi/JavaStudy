package 인스턴스멤버;

public class CalculatorExample {
	public static void main(String[] args){
		double result1 = 10*10*Calculator.pi;
		
		int plus_re = Calculator.plus(5, 2);
		int minus_re = Calculator.minus(5, 2);
		
		System.out.println("pi: "+result1);
		System.out.println("plus: "+plus_re);
		System.out.println("minus: "+minus_re);
	}

}
