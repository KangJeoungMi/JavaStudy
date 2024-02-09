package 인스턴스멤버;

public class FinalField_Korean {
	//인스턴스 final필드 선언
	final String nation="대한민국";
	final String ssn;
	
	//인스턴스 필드 선언
	String name;
	
	//생성자 선언
	public FinalField_Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
}
