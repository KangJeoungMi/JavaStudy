package GetterSetter;

public class Singleton {
	//private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();
	
	//private 접근 권한을 갖는 생성자 선언 - 외부에서 생성자 사용(호출)을 차단한다
	private Singleton() {}
	
	
	//public 접근 권한을 갖는 정적 메소드 선언 - getter():메소드 를 통해서 생성한 객체를 보내준다.
	public static Singleton getSingleton() {
		return singleton;
	}
	
}
