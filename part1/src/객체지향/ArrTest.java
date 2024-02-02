package 객체지향;

public class ArrTest {
	public static void arrArg(int[] a/*매개변수*/) {//arrArg의 메서드를 만듦(메서드의 정의)
		//배열 뿌리기
		
		for(int j=0; j<a.length; j++) {
			System.out.println(j+a[j]);
		}
		
	}
	public static void main(String[] args) {
		int[] ary = {10,20,30,40,50};
		for(int i=0; i<ary.length; i++) {
			//System.out.print(ary[i]); 
			}
		int[] ary1;
		ary = new int[] {50,60,70,80,90,100};//초기화

		arrArg(new int[] {1,2,3});
	}
	
	
}
