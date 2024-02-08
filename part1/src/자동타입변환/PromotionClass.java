package 자동타입변환;

interface A {}
class B implements A{}
class C implements A{}
class D extends B{}
class E extends B{}

public class PromotionClass {
	public static void main(String[] args) {
		//구현객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		//인터페이스 변수 선언
		A a;
		
		//구현객체 대입
		a=b;//a<-b(자동 타입 변환)
		a=c;//a<-c(자동 타입 변환)
		a=d;//a<-d(자동 타입 변환)
		a=e;//a<-e(자동 타입 변환)
	}

}
