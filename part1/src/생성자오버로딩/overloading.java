package 생성자오버로딩;

public class overloading {
	//매개값이 한개면 정사각형의 넓이 두개면 직사각형의 넓이
	
	double rec(double width){
		return width*width;
	}
	double rec(double width, double height) {
		return width*height;
	}

}
