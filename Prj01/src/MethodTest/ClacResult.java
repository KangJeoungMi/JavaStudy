package MethodTest;

import java.util.Scanner;

public class ClacResult {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> x: ");
		int x = sc.nextInt();
		
		System.out.print(">> y: ");
		int y = sc.nextInt();
		
		
		Clac myClac = new Clac(x,y);

		int res = myClac.plus();
		System.out.println(res);
		int res2 = myClac.mi();
		System.out.println(res2);
		int res3 = myClac.multi();
		System.out.println(res3);
		double res4 = myClac.divide();
		System.out.println(res4);
		/*
		 * myClac.plus(); myClac.mi(); myClac.multi(); myClac.divide();
		 */

		
		
		
		
		
		
		sc.close();
		
	}
}
