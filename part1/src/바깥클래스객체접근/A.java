package 바깥클래스객체접근;

public class A {
	//A인스턴스 필드
	String field = "A-field";
	
	//A인스턴스메소드
	void method() {
		System.out.println("A-field");
	}
	
	class B{
		//인스턴스 필드
		String field = "B-field";
		
		//B인스턴스 메소드
		void method() {
			System.out.println("B-field");
		}
		
		//B인스턴스 메소드
		void print() {
			//B 객체의 필드와 메소드 사용
			System.out.println(this.field);
			this.method();
			//A 객체의 필드와 메소드 사용
			System.out.println(A.this.field);
			A.this.method();
		}
	}
	
	//A의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
	
}
