package 오버라이딩;

public class Computerexample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator Cal = new Calculator();
		System.out.println("원면적: "+ Cal.areaCircle(r));
		System.out.println();
		
		computer Com = new computer();
		System.out.println("원면적: "+ Com.areaCircle(r));
		System.out.println();
	}
}
