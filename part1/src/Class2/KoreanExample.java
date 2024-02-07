package Class2;

public class KoreanExample {
	public static void main(String[] args) {
		Korea k1 = new Korea("박자바", "020225-1234567");
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korea k2 = new Korea("김자바", "010322-8974566");
		
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
		Korea k3 = new Korea();
		

	}
}
