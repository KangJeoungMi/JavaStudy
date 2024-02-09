package protected2;

import protected1.A;
public class D extends A{
	public D() {
		super();
	}
	
	public void method1() {
		this.field="value";
		this.method();
	}
	
	//직접 객체를 생성하는 것은 안됨
	public void method2() {
		//A a = new A();
		//a.field = "value";
		this.method();
	}
}
