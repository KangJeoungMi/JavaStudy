package GetterSetter;

public class Car {
	//필드선언
	private int speed;
	private boolean stop;
	
	//speed 필드의 게터세터 선언
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = speed;
			return;
		}else {
			this.speed = speed;
		}
		
	}
	
	//stop필드의 게터세터 선언
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
}
