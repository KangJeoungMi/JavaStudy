package 인터페이스상속;

public class ExtendsExample {
	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		interfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		interfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		interfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
	}
}
