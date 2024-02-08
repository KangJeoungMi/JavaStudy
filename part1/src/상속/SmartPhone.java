package 상속;

public class SmartPhone extends phone{
	
	//필드 선언
	public boolean wifi;
	
	SmartPhone() {
		System.out.println("나는 스마트폰의 디폴트 생성자입니다");
	}
	
	//생성자 선언(두개의 입력을 가지는 생성자)
	public SmartPhone(String model,String color) {
		this.model = model;
		this.color = color;
	}
	
	//메소드 선언
	public void setwifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	
	public void Internet() {
		System.out.println("인터넷 연결");
	}
	
	

}
