package 상속;

public class Smartphone2 extends phone2{
	//생성자 선언(두개의 입력을 가지는 생성자)
		public Smartphone2(String model,String color) {
			super(model,color);
			
			System.out.println("Smartphone2(String model,String color)실행");
		}

}
