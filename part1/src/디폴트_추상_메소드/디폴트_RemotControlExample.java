package 디폴트_추상_메소드;

public class 디폴트_RemotControlExample {
	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//TV객체를 생성 인터페이스 변수에 대입
		rc = new TV();
		rc.TurnOn();
		rc.setVolume(5);
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
	}

}
