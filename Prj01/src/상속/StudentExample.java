package 상속;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동","남성",20,"대학교",4);
		
		//나는 xx학교 x학년의 xx학번 재학중인 xx살 성별 홍길동입니다.
		
		/*
		 * student.myInfo(); 
		 * Person person = new Person("홍길동","남성"); 
		 * person.myInfo();
		 */
		student.myInfo();
		student.Mode  = Student.person;
		student.myInfo();
		student.Mode  = Student.student;
	}
}
