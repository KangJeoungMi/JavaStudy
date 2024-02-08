package 디폴트_추상_메소드;

public class TV implements RemoteControl{
	private int volume;
	
	@Override
	public void TurnOn() {
		System.out.println("TV켜기");
	}

	@Override
	public void TurnOff() {
		System.out.println("TV끄기");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_V) {
			this.volume = RemoteControl.MAX_V;
		}else if(volume<RemoteControl.MIN_V) {
			this.volume = RemoteControl.MIN_V;
		}else {
			this.volume = volume;
		}
		System.out.print("현재 볼륨: "+this.volume);
	}
}
