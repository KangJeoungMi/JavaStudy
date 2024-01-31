package ch01;

public class InfinityAndNaNcheckExample {
	public static void main(String[] args) {
		int x=5;
		double y = 0.0;
		double z = x/y;
		double z1 = x%y;
		
		System.out.println(z);
		
		System.out.println(z1);
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("산출불가");
		}else {
			System.out.println(z+2);
		}
		
	}
}
