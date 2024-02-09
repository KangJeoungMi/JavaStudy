package 인스턴스멤버;

public class FinalField_KoreanExample {
	public static void main(String[] args) {
		//객체 생성 시 주민등록 번호와 이름 전달
		FinalField_Korean k1 = new FinalField_Korean("123456-1234567","김자바");
		//필드 값읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//Final 필드는 값을 변경할 수 없다
		//k1.nation="USA";
		//k1.nation="123-12-1234";
		
		//Final 필드가 아닌 값은 변경 할 수 있다
		k1.name="박자바";
		
		
		//--------------------------------------
		
		System.out.println(k1.toString());
	}

}
