package 상속;

public class Student extends Person {
	int S_iD;//학번
	String schoole;//학교
	int grade;//학년

	//나는 xx학교 x학년의 xx학번 재학중인 xx살 성별 홍길동입니다.
	
	//생성자 선언
	public Student(String name, String gender,int S_iD,String schoole,int grade ) {
		super(name,gender);

		this.S_iD = S_iD;
		this.schoole = schoole;
		this.grade = grade;
	}
	
	
	
	public static final int student = 1;
	public static final int person = 2;
	
	public int Mode = student;
	
	@Override
	public void myInfo() {
		if(Mode == student) {
			System.out.println("나는 xx학교 x학년의 xx학번 재학중인 xx살 성별 홍길동입니다.");
		}else {
			super.myInfo();
		}
	}
}
