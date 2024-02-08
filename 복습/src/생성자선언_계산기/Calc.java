package 생성자선언_계산기;

public class Calc {
//변수 x,y값 받아오기 생성자 생성하기
	int x,y;
	
	Calc(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	int plus() {
		int result = x+y;
		return result;
	}
	
	
}
