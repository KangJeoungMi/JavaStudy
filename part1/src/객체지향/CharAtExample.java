package 객체지향;

public class CharAtExample {
	public static void main(String[] args) {
		String ID = "123456226584";
		char sex = ID.charAt(7);
 
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		
		if(sex == '1' || sex == '3') {
			System.out.println("남자");
		}else if(sex == '2' || sex == '4') {
			System.out.println("여자");
		}

	}
}
