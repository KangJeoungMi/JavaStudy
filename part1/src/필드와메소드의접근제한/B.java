package 필드와메소드의접근제한;

public class B {
	public void method() {
		A a= new A();
		
		a.field1=1;
		a.field2=1;
		//a.field3=1;//컴파일 에러 :private 생성자 접근 불가

		
		a.method1();
		a.method2();
		//a.method3();//컴파일 에러 :private 생성자 접근 불가

		
		
	}
}
