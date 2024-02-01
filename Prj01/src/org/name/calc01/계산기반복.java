package org.name.calc01;

import java.util.Scanner;

public class 계산기반복 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {

			
			System.out.println("x: ");
			int x = sc.nextInt();
			System.out.println("y: ");
			int y = sc.nextInt();
			
			sc.nextLine();
			System.out.println("연산자(+,-,*,/)선택");
			String z = sc.nextLine();

			
			if(z.equals("+")) {
				System.out.println("x + y= "+(x+y));
			}else if(z.equals("-")) {
				System.out.println("x - y= "+(x-y));
			}else if(z.equals("*")) {
				System.out.println("x * y= "+x*y);
			}else if(z.equals("/")) {
				System.out.println("x / y= "+x/y);
			}

			System.out.println("계속 진행할까요?(q:종료 y:진행)");
			String A = sc.nextLine();
			if(A.equals("q")) {
				System.out.println("프로그램 종료");
				break;
			}else if(A.equals("y")){
				continue;
				}
			
			
			
		}
	}

}
