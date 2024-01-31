package org.name.calc01;

import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		//계산기 만들기
		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.println(">> "); 
		 * int x = scanner.nextInt();
		 * System.out.println(">> x: "+x);
		 * 
		 * int y = scanner.nextInt(); 
		 * System.out.println(">> y: "+y);
		 * 
		 * System.out.println("x + y= "+ (x+y));
		 */
		/*
		 * System.out.println("x - y= "+ (x-y)); 
		 * System.out.println("x * y= "+ (x*y));
		 * System.out.println("x % y= "+ (x%y));
		 */
		
		
		//연산자 입력받기
		System.out.print(">> x: ");
		int x1 = scanner.nextInt();
		
		System.out.print(">> y: ");
		int y1 = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print(">> 연산자(+,-,*,/)를 입력하세요 : ");
		String z = scanner.nextLine();
		
		
		if(z.equals("+")) {
			System.out.println("x + y= "+(x1+y1));
		}else if(z.equals("-")) {
			System.out.println("x - y= "+(x1-y1));
		}else if(z.equals("*")) {
			System.out.println("x * y= "+x1*y1);
		}else if(z.equals("/")) {
			System.out.println("x / y= "+x1/y1);
		}    
		
		scanner.close();
	}

}
