package 디폴트_추상_메소드;

public interface RemoteControl {
	//상수필드
	int MAX_V = 10;
	int MIN_V = 0;
	
	//추상메소드
	void TurnOn();
	void TurnOff();
	void setVolume(int volume);
	
	//디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음");
			//추상메소ㄷ 호출하면서 상수 필드 사용
			setVolume(MIN_V);
		}else {
			System.out.println("무음");
		}
	}
}
