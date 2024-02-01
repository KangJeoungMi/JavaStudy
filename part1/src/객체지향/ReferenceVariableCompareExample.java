package 객체지향;

public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		int[] arr1;//배열변수 arr1 선언
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3};//배열{1,2,3}에 생성하고 arr1변수에 대입
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		System.out.println(arr1==arr2);//결과값 flase
		System.out.println(arr2==arr3);//결과값 true
	}
}
