package 배열;

public class AdvanceForExample {

	public static void main(String[] args) {
		//향상된 for문 for(타입변수:배열){}
		
		//배열 변수 선언과 배열 생성
		int[] score = {95,71,84,93,87};
		
		//배열 항목 전체 합 구하기
		int sum=0;
		/*for(int s:score) {
			sum+=s;
		}*/
		
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println(sum);
		//배열 항목 전체 평균 구하기
		double avg =(double)sum/score.length;
		System.out.println(avg);
	}

}
