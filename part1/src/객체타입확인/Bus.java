package 객체타입확인;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스 달림");
	}
	
	public void CheckFare() {
		System.out.println("요금 확인");
	}
}
