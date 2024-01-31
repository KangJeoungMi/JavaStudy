package ch01;

public class logicalOperationExample {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if((65<=charCode) && (charCode<=90)){
			System.out.println("대문자");
		}
		
		if((97<=charCode) && (charCode<=122)){
			System.out.println("소문자");
		}
		
		if((48<=charCode) && (charCode<=57)){
			System.out.println("숫자 0~9");
		}
		
		
	}

}
