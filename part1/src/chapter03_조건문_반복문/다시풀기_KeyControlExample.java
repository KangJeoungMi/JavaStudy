package chapter03_조건문_반복문;

import java.util.Scanner;

public class 다시풀기_KeyControlExample {
	public static void main(String[] args){
		
		//1,2를 입력했을 때 속도를 증가 감속시키고 3을 입력했을때 중단한다
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("1.증 2.감 3.중지");
			System.out.println("선택: ");
			
			String strNum = sc.nextLine();
			
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재속도 = "+ speed);
			}else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재속도 = "+ speed);
			}else if (strNum.equals("3")) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
	}

}
