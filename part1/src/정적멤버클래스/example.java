package 정적멤버클래스;

public class example {
	
	class A{
		class B{}
	}
	A a  = new A();
	A.B b = a.new B();
	
	class A{
		static class B{}
	}
	A.B b = new A.B();

}
