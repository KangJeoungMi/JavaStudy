package 매개변수의다형성;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스 달림");
	}
}
