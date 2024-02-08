package 정적메소드;


public class remoteControlExample {
	public static void main(String[] args) {
		remoteControl rc;
		
		//TV객체를 생성 인터페이스 변수에 대입
		rc = new TV();
		rc.TurnOn();
		rc.setVolume(5);
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		//Audio 객체를 생성 인터페이스 변수에 대입
		rc = new Audio();
		rc.TurnOn();
		rc.setVolume(5);
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();

		remoteControl.ChangeBettery();
	}
}
