package Class;

//1. Setter 이용하여 초기화하기

class CarTwo{
	//멤버변수, 속성, 필드
	String Kind = "세단";
	String modeName;
	String Carcolor;
	int CarYear;
	//메서드 : 멤버 함수, 기능,행위
	public void SetModeName(String modeName){
		this.modeName = modeName;
	}
	
	public void SetModeName1(String Carcolor){
		this.Carcolor = Carcolor;
	}
	
	public void SetModeName2(int CarYear){
		this.CarYear = CarYear;
	}
}


public class setter_CreateCarTwo {

	public static void main(String[] args) {
		CarTwo c = new CarTwo();
		
		c.SetModeName("람보르기니");
		c.SetModeName1("흰색");
		c.SetModeName2(2024);
		System.out.printf("나의 차는 %s이고 색상은 %s이며 연식은 %d년입니다",c.modeName,c.Carcolor,c.CarYear);
	}

}
