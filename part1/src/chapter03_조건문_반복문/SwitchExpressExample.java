package chapter03_조건문_반복문;

public class SwitchExpressExample {
	public static void mian (String[] args) {
		char grade = 'B';
		
		switch (grade) {
		case 'A','a' ->{
			System.out.println("우수 회원");
		}case 'B','b' ->{
			System.out.println("일반 회원");
		}

		default ->
		System.out.println("손님");
		}
		
		switch(grade) {
		case 'A','a'-> System.out.println("우수 회원");
		case 'B','b'-> System.out.println("일반 회원");
		default->System.out.println("손님");
		}
	}
	
	

}
