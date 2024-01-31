package ch01;

public class overflowunderflowExample {
	public static void main (String[] args) {
		byte v1 = 125;
		for(int i=0; i<5; i++) {
			v1++;
			System.out.println(v1);

		}
		byte v2 = -125;
		for(int i=0; i<5; i++) {
			v2--;
			System.out.println(v2);

		}
	}

}
