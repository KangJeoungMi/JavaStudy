package private메소드;

public interface Service {
	
	default void defaultMethod01() {
		System.out.println("defaultMethod01 종속코드");
		defaultCommon();
	}
	default void defaultMethod02() {
		System.out.println("defaultMethod02 종속코드");
		defaultCommon();
	}
	
	private void defaultCommon() {
		System.out.println("defaultCommon중복코드A");
		System.out.println("defaultCommon 중복코드B");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1 종속코드");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속코드");
		staticCommon();
	}
	
	private static void staticCommon(){
		System.out.println("staticCommon 중복코드C");
		System.out.println("staticCommon 중복코드D");
	}
	
}
