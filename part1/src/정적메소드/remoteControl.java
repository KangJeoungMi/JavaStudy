package 정적메소드;

public interface remoteControl {
	//상수필드
			int MAX_V = 10;
			int MIN_V = 0;
			
			//추상메소드
			void TurnOn();
			void TurnOff();
			void setVolume(int volume);
			
			//디폴트 인스턴스 메소드
			default void setMute(boolean mute) {}
			
			static void ChangeBettery() {
				System.out.println("건전지 교체");
			}
}
