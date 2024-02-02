package 배열;

public class ArrayCopyExample {
	public static void main(String[] args) {
		//길이 3인 배열
		String[] arr = {"java","python","html"};
		//길이 5인 배열
		String[] arr2 = new String[5];
		
		//배열 복사
		System.arraycopy(arr,0,arr2,0,arr.length);
		//배열 출력
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
	}

}
