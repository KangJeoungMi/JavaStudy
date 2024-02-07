package 정수실수오버로딩;

public class Calc {
	int x,y;
	double a,b;
	Calc (int x,int y){
		this.x =x;
		this.y =y;
	}
	Calc (double a,double b){
		this.a =a;
		this.b =b;
	}
	
	void plus() {
		int result = x+y;
		double result2 = a+b;
		System.out.println(result);
		System.out.println(result2);

	}
}
