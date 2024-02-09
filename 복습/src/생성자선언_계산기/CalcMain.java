package 생성자선언_계산기;

import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> x:");
		int x = sc.nextInt();
		
		System.out.print(">> y:");
		int y = sc.nextInt();
		
		Calc myCalc = new Calc(x,y);
		
		int res = myCalc.plus();
		System.out.println(res);
	}
}
