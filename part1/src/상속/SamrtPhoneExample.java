package 상속;

public class SamrtPhoneExample {
	public static void main(String[] args) {
		
		//스마트폰 객체 생성
		//SmartPhone sm = new SmartPhone("갤럭시", "은색");
		
		SmartPhone sm = new SmartPhone();
		//폰으로부터 상속받은 필드 읽기
		System.out.println("model"+sm.model);
		System.out.println("color"+sm.color);
		//스마트폰 필드 읽기
		System.out.println("wifi"+sm.wifi);
		
		
		//폰으로부터 상속받은 메소드 호출
		sm.bell();
		sm.sendVoice("hello");
		sm.receiveVoice("hi, my name is hong");
		sm.sendVoice("hi");
		sm.hangUp();
		
		//스마트폰의 메소드 호출
		sm.setwifi(true);
		sm.Internet();
		
		
		
	}

}
