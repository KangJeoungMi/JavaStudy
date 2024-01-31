package chapter03_조건문_반복문;

public class SwitchcharExample {
	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원");
			break;
		default:
			
			System.out.println("손님");
		}
	}

}
