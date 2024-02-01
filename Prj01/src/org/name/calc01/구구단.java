package org.name.calc01;

import java.util.Scanner;

public class 구구단 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//단을 선택하여 구구단 불러오기
		
		System.out.println("몇단을 출력하시겠습니까");
		int multi = sc.nextInt();

		for(int i=1; i<10; i++) {
			
				System.out.println(multi+"X"+i+"="+multi*i);

		}
		
		
	}
}
