package 객체지향;

public class LenghtExample {
	public static void main(String[] args) {
		String num = "0009294258441";
		int length = num.length();
		
		System.out.println(length);//값 : 13
		if(length==13) {
			System.out.println("주민등록번호 숫자가 맞습니다");
		}else {
			System.out.println("주민등록번호 숫자가 아닙니다");
		}//값 : 주민등록번호 숫자가 맞습니다
	}
}
