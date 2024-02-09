package 인스턴스멤버;

public class Car {
	//인스턴스 필드 선언
	int speed;
	//인스턴스 메소드 선언
	void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	
	static void simulate() {
		//객체생성
		Car myCar = new Car();
		
		//인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
		/*
		 * 정적 메소드에 인스턴스 메소드를 사용하기 위해서는
		 * 객체를 생성하고 값을 넣어야 한다
		 * */
	}
	public static void main(String[] args) {
		//정적 메소드 호출
		simulate();
		
		//객체생성
		Car myCar = new Car();
		//인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
		
		/*
		 * main() 메서드는 Car 클래스의 객체를 생성하고 
		 * 속성 speed에 값을 할당한 후 run() 메서드를 호출하여 자동차를 시뮬레이션합니다. 
		 * 
		 * simulate() 메서드는 main() 메서드와 동일한 방식으로 
		 * 작동하지만, 클래스 메서드로 정의되어 객체를 생성하지
		 * 않고도 직접 호출할 수 있습니다.
		 */
	}

}
