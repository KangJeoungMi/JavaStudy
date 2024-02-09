package 인스턴스멤버;

public class Earth {
	//상수 선언 및 초기화
	static final double EARTH_RADIOUS = 6400;
	//상수선언
	static final double EARTH_SURFACE_AREA;
	//정적 블록에서 상수 초기화
	static {
		EARTH_SURFACE_AREA = 4* Math.PI*EARTH_RADIOUS*EARTH_RADIOUS;
	}
	/*
	 * 상수 : 불변의 값을 저장하는 필드
	 * 객체마다 저장할 필요가 없고 여러개의 값을 가지면 안됨
	 * 따라서 static이면서 final이어야 한다
	 * 
	 * static final 타입 상수[=초기값];
	 * 
	 * 초기값은 선언 시에 주지만 복잡한 초기화가 필요할 경우 <정적 블록>을 사용한다
	 * static final 타입상수;
	 * static {상수 = 초기값;}
	 */
	 
}
