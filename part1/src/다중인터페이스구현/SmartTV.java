package 다중인터페이스구현;

public class SmartTV implements RemoteControl, Searchable{
	@Override
	public void turnOn() {
		System.out.println("TV 켜기");
	};
	@Override
	public void turnOff() {
		System.out.println("TV 끄기");
	};
	@Override
	public void search(String url) {
		System.out.println("검색: "+url);
	};
}
