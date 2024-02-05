package methodex;

public class MyClassMain {
	   public static void main(String[] args) {
		      MyClass m = new MyClass("홍길동", 25);
		      /*
		       * MyClass m = new MyClass(); 코드는 
		       * MyClass 클래스의 새로운 인스턴스를 생성하고 m 변수에 참조를 저장합니다. 
		       * 즉, m 변수를 통해 MyClass 객체의 멤버 변수와 메서드에 접근할 수 있습니다.
		       * */
		      m.printMyClass();
		      
		   }

}
