package 정적메소드;


public class TV implements remoteControl{
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
		if (volume>remoteControl.MAX_V) {
			this.volume = remoteControl.MAX_V;
		}else if(volume<remoteControl.MIN_V) {
			this.volume = remoteControl.MIN_V;
		}else {
			this.volume = volume;
		}
		System.out.print("현재 볼륨: "+this.volume);
	}
}
