package 정적멤버클래스;

public class A {
	//인스턴스 멤버 클래스
	static class B{
		int field1 = 1;
		static int field2 = 2;
		
		B(){
			System.out.println("B생성자 실행");
		}
		
		void method1() {
			System.out.println("B메소드1 실행");
		}
		
		static void method2() {
			System.out.println("B메소드2 실행");
		}
	}
	
	
	//------------------------------------------
	B field3 = new B();
	
	static B field4 = new B();
	
	A(){
		B b = new B();
	}
	
	void method3() {
		B b = new B();
	}
	
	static void method4() {
		B b = new B();
	}
	
	

}
