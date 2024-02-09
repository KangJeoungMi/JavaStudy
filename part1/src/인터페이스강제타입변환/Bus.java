package 인터페이스강제타입변환;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스 달림");
	}
	
	public void checkFare() {
		System.out.println("승차요금 확인");
	}

}
