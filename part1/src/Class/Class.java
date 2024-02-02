package Class;

class car{
	String name;  //멤버 변수==필드==속성
	int number;
	String Color;
}

public class Class {
	public static void main(String[] args) {
		//car 타입의 변수 c에 car클래스의 객체를 집어넣어라
		car c = new car();//객체생성(변수 선언 문법):디폴트 생성자 호출
		
		car c1 = new car();
		car c2 = new car();
		
		c.name = "A";
		c1.name = "B";
		c2.name = "C";
		
		System.out.println(c.name);
		System.out.println(c1.name);
		System.out.println(c2.name);
	}
}
