package Class2;

public class Korea {
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korea(String n, String s) {
		name = n;
		ssn = s;
	}
	public Korea() {//default 생성자
		int n = 100;
		System.out.println("나는 디폴트 생성자");
		System.out.println("n: "+n);
		
	}
}
