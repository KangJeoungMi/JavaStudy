package GetterSetter;

public class SingletonExample {
	public static void main(String[] args) {
		/*
		 * Singleton obj1 = new Singleton();//컴파일 에러
		 * Singleton obj2 = new Singleton();//컴파일 에러
		 * */
		
		//정적 메소드를 호줄해서 싱글톤 객체를 얻음
		Singleton obj1 = Singleton.getSingleton();
		Singleton obj2 = Singleton.getSingleton();
		
		//동일한 객체를 참조하는지 확인
		if(obj1==obj2) {
			System.out.println("같은 싱글톤 객체");
		}else {
			System.out.println("다른 싱글톤 객체");
		}
		
	
	}

}
