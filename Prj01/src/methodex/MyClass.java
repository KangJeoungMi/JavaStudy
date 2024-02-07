package methodex;

public class MyClass {
	//클래스 구성 멤버 : 멤버 변수 + 멤버 함수 + 생성자
	   
	   //++++++++멤버변수
	   String name;//속성값 name과 age를 가지고 있는 myClass
	   int age;
		/*
		 * String name;: name이라는 문자열 타입의 멤버 변수를 선언합니다. 
		 * int age;: age이라는 정수 타입의 멤버 변수를 선언합니다.
		 */
	   
	   //+++++++생성자
	   MyClass(String name, int age){
	      this.name = name;
	      this.age = age;
	   }
	   /*MyClass(String name, int age) 라는 생성자를 정의합니다.
	    * 매개변수:
	    * String name: 생성자에 전달되는 이름
	    * int age: 생성자에 전달되는 나이
	    * 기능:
	    * 생성자는 name과 age 매개변수를 사용하여 MyClass 객체를 초기화합니다.*/
	   
	   //++++++++멤버함수
	   
	   void printMyClass() {
	      System.out.printf("나의 이름은 %s, 나이는 %d",name,age);

	   }
}
