package 인스턴스멤버;
//Stack과  static은 다른 개념
public class Calculator {
	static double pi = 3.1415;//정적멤버 : 선언과 동시에 바로 초기화 시킨다
	
	static int plus(int x,int y) {
		return x+y;
	}
	
	static int minus(int x,int y) {
		return x-y;
	}
}
