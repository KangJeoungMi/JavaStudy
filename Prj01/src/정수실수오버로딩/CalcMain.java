package 정수실수오버로딩;

import java.util.Scanner;
//메소드 오버로딩(입력의 타입 개수가 다르면 메소드가 같아도 됨)


public class CalcMain {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		double x = 1.2;
		double y = 2.4;
		
		plus(a,b);
		plus(a);
		plus(x,y);
		
	}
	
	public static void plus (int a, int b) {//plus:메소드
		int res = a+b;
		System.out.println(res);	
	}
	public static void plus (int a) {
		int res = a;
		System.out.println(res);	
	}
	public static void plus (double a, double b) {
		double res = a+b;
		System.out.println(res);	
	}
	
}
