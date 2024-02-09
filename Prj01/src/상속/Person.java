package 상속;

public class Person {

	public String name;
	public String gender;
	
	void myInfo() {
		
		System.out.println("나의 이름은 (홍길동)이고 (남성)입니다");
	}
	public Person(String name,String gender) {
		this.name=name;
		this.gender = gender;
	}

}
