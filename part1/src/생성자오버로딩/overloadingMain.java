package 생성자오버로딩;

public class overloadingMain {
	public static void main(String[] args) {
		overloading O = new overloading();
		
		double result = O.rec(10);
		double result1 = O.rec(20,30);
		
		System.out.println(result);
		System.out.println(result1);
	}
}
