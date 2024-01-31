package chapter03_조건문_반복문;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		if (score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("A등급");
		}else if (score>=80) {
			System.out.println("점수가 90보다 작고 80보다 큽니다.");
			System.out.println("B등급");
		}else if (score>=70) {
			System.out.println("점수가 80보다 작고 70보다 큽니다.");
			System.out.println("C등급");
		}else if (score>=60) {
			System.out.println("점수가 70보다 작고 60보다 큽니다.");
			System.out.println("D등급");
		}else {
			System.out.println("점수가 60보다 작습니다");
			System.out.println("F등급");
		}
	}
}
