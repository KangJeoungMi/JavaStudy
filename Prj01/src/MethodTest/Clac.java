package MethodTest;

public class Clac {
	int x,y;
	Clac (int x,int y){
		this.x =x;
		this.y =y;
	}
	
	int plus() {
		int result = x+y;
		//System.out.println(result);
		return result;
		}

	
	int mi() {
		int result = x-y;
		//System.out.println(result);
		return result;
	}
	
	int multi() {
		int result = x*y;
		//System.out.println(result);
		return result;
	}
	double divide() {
		double result = (double)x/(double)y;
		//System.out.println(result);
		return result;
	}
}
