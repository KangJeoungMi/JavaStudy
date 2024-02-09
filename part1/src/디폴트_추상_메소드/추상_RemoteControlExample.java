package 디폴트_추상_메소드;

public class 추상_RemoteControlExample {
	public static void main(String[] args) {
		//인터페이스 변수 선언
			RemoteControl rc;
				
		//TV객체를 생성 인터페이스 변수에 대입
		rc = new TV();
		rc.TurnOn();
		rc.setVolume(5);
		rc.TurnOff();

		//Audio 객체를 생성 인터페이스 변수에 대입
		rc = new Audio();
		rc.TurnOn();
		rc.setVolume(5);
		rc.TurnOff();		
	}
}
