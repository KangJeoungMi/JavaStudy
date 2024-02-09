package 상속;

public class SmartphoneExample2 {
	public static void main(String[] args) {
		//스마트폰 객체 생성
		Smartphone2 sm = new Smartphone2("갤럭시", "은색");
		
		//폰으로부터 상속받은 필드 읽기
		System.out.println("model"+sm.model);
		System.out.println("color"+sm.color);
	}

}
