package 배열;

public class arrcopy {
	public static void main(String[] args) {
		//길이가 3인 배열 복사
		int[] arr= {1,2,3};
		//길이가 5인 배열 새로 생성
		int[] newarr = new int[5];
		
		//배열 복사
		for(int i=0; i<arr.length; i++) {
			newarr[i] = arr[i];
			
		}
		//배열 출력
		for(int j=0; j<newarr.length; j++) {
			System.out.print(newarr[j]+",");
		}
	}
	
}
