package private메소드;

public class SurviceExample {
	public static void main(String[] args) {
		Service service = new SurviceImpl();
		
		service.defaultMethod01();
		service.defaultMethod02();
		
		Service.staticMethod1();
		Service.staticMethod2();
	}
}
