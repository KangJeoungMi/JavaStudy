package MethodTest;

public class methodTest {
	int num = 100;
	String name;
	
	public static void method1() {//(static : 객체 생성 없이 출력)method1선언, 정의(입력,출력 없음)
		System.out.println("method1 실행");
		
	}
	public static void method2(int num) {//int num:매개변수
		System.out.println("나는 입력하나 갖는 메소드입니다"+num);
	}
	public static int method3(int num) {//int num:매개변수
		System.out.printf("나는 입력과 출력이 있는 메소드입니다 입력:%d, 출력: %d\n" ,num,num);
		int n;
		n= num;
		return n;
	}
	public static void main(String[] args) {
		method1(); //method()메서드 호출 -> 실행
		method2(100);
		int res = method3(300);
		System.out.printf("리턴값"+res);
	}
	
}
