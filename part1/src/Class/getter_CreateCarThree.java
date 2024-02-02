package Class;

//2. 생성자를 이용하여 초기화하기

class CarThree{
	//멤버변수, 속성, 필드
	String Kind = "세단";
	String modeName;
	String Carcolor;
	int CarYear;
	
	/*
	 * CarThree(){//생성자 = 디폴트 생성자:입력이 없는 생성자 System.out.println("나는 디폴트 생성자 입니다");
	 * };
	 */
	CarThree(String modeName,String Carcolor,int CarYear){
		this.modeName = modeName;
		this.Carcolor = Carcolor;
		this.CarYear = CarYear;
		System.out.println("나는 매개변수 세개 받는 생성자 입니다");
	};
}
public class getter_CreateCarThree {
	public static void main(String[] args) {
		//CarThree c = new CarThree();//객체를 생성하면 자동으로 디폴트 생성자가 호출된다
		CarThree c1 = new CarThree("벤츠","검정", 2023);//,"검정", 2023
				System.out.printf("나의 차는 %s %s이고 색상은 %s이며 연식은 %d년입니다",c1.modeName,c1.Kind,c1.Carcolor,c1.CarYear);
	}
}
