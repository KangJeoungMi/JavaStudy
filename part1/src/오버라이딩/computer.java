package 오버라이딩;

public class computer extends Calculator{
	
	@Override
	public double areaCircle(double r) {
		System.out.println("computer객체 areaCircle실행");
		return Math.PI*r*r;
	}
}
