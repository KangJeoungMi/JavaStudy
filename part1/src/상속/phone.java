package 상속;

public class phone {
	//필드 선언
	public String model;
	public String color;
	
	//메소드 선언
	public void bell() {
		System.out.println("벨이 울림");
		}
		
	public void sendVoice(String message) {
		System.out.println("본인"+message);
	}
		
	public void receiveVoice(String message) {
		System.out.println("상대방"+message);
	}
		
	public void hangUp() {
		System.out.println("전화 끊기");
	}
	
	phone() {
		System.out.println("나는 폰의 디폴트 생성자 입니다");
	}

}
