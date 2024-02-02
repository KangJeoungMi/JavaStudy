package 객체지향;

public class ReplaceExample {
	public static void main(String[] args){
		String oldStr = "자바 프로그래밍";
		
		String changestr = oldStr.replace("자바", "JAVA");
		System.out.println(changestr);
		
		
		String sub = "자바 프로그래밍";
		int index = sub.indexOf("프로그래밍");
		System.out.println(index);
		
		String board = "번호,제목,내용,성명";
		String[] arr = board.split(",");

		String my_string= "love";
		int k=3;
        //String answer = "love";

		for (int i=0; i<k; i++){
            my_string += i;
            System.out.print("my_string");
        }
	}

}
