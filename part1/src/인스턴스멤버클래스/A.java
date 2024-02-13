package 인스턴스멤버클래스;

public class A {
	//인스턴스 멤버 클래스
	class B{
		//인스턴스 필드
				int field1 = 1;
				
				static int field2 = 2;
				
				//생성자
				B(){
					System.out.println("B생성자 실행");
				}
				
				//인스턴스 메소드
				void method1() {
					System.out.println("B-method1 실행");
				}
				//정적 메소드
				static void method2() {
					System.out.println("B-method2 실행");
				}
			}
			
			void useB() {
				B b = new B();
				System.out.println(b.field1);
				b.method1();
				
				System.out.println(B.field2);
				B.method2();
	}
			
	//--------------------------------------------
	
	//인스턴스 필드값으로 B객체 대입
	// class B 타입으로 객체생성
	B field = new B();
	
	//생성자
	A(){
		B b = new B();
	}
	//인스턴드 메소드
	void method() {
		B b = new B();
	}

}
