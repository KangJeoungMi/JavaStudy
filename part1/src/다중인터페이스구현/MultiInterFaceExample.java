package 다중인터페이스구현;

public class MultiInterFaceExample {
	public static void main(String[] args) {
		RemoteControl re = new SmartTV();
		
		re.turnOn();
		re.turnOff();
		
		Searchable se = new SmartTV();
		se.search("youtube.com");
	}
}
