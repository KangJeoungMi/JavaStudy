package 인스턴스멤버클래스;


public class AExample {
	public static void main(String[] args) {
		//A 객체생성
		A a = new A();
		
		//인틋턴스 메소드 호출
		a.useB();

		//----------------------------------------------
		
		// B 객체생성
		A.B b = a.new B();//a 클래스 안에 있는 B생성자 호출
		//class B가 class A의 멤버변수 이므로 객체를 생성하기 위해서는
		//a.을 입력해야한다
		System.out.println(b.toString());
		
	}


}
