package ch01;

import java.util.Scanner;

public class 개념이해필요_scanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String str = scanner.nextLine();
		
		
		System.out.println("나이를 입력하세요");
		String age = scanner.nextLine();
		int y = Integer.parseInt(age);
		
	}
	
}
