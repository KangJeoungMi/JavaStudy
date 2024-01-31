package ch01;

public class 문제_AccuracyExample1 {
	public static void main(String[] args) {
		//문제: 사과 1개를 0.1단위의 10조각으로 보고, 그 중 7조각(0.7)을 뺀 3조각(0.3)을 result 변수에 저장한다
		
		int apple= 1;
		double piece = 0.1;
		int num = 7;
		
		double result = apple-piece*num;
		System.out.println((float)result);//float가 없으면 결과값이 0.299999가 나온다
		
		int apple1 = 1;
		int totalpiece = apple1*10;
		int num1 = 7;
		
		int result1 = totalpiece-num1;
		System.out.println(result1);
		System.out.println(result1/10.0);
	}
}
