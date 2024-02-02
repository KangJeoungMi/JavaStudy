package 배열;

public class MultidimensionalArraryValueListExample {
	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] Score = {
				{80,90,96},
				{76,88}
			};
		
		//배열의 길이
		System.out.println("1차원 배열의 길이(반의 수)"+Score.length);
		System.out.println("1차원 배열의 길이(첫번째 반의 학생 수)"+Score[0]);
		System.out.println("1차원 배열의 길이(두번째 반의 학생 수)"+Score[1]);
		
		//첫번째 반의 세번째 학생의 점수 읽기
		System.out.println("첫번째 반의 세번째 학생의 점수"+Score[0][2]);
		//두번째 반의 두번째 학생의 점수 읽기
		System.out.println("두번째 반의 두번째 학생의 점수"+Score[1][1]);
		
		//첫번째 반의 평균점수 구하기
		int sum = 0;
		for (int i=0; i<Score[0].length; i++) {//첫 행의 점수의 갯수 {80,90,96} : 3개
			sum += Score[0][i];// 첫행의 갯수 더하기 : 90+80+96
		}
		double avg = sum/Score[0].length;//평균구하기 sum의 결과값 / 첫행의 점수의 갯수
		
		System.out.println("첫번째 반의 평균점수"+(int)avg); //: 88.0
		
		//전체학생의 평균점수
		int sum2 = 0;//전체 학생의 점수의 합 초기 값
		int student = 0;//전체 반의 초기 값
		for (int j=0; j<Score.length; j++) {//전체 반의 갯수{80,90,96},{76,88} : 3,2
			student += Score[j].length;// 전체 반의 학생 수 : 5
			//System.out.println(student);
			
			for(int k=0; k<Score[j].length; k++) {//전체 학생의 수 : 5개
				sum2 += Score[j][k]; //학생의 점수 더하기 Score[j][k] 
				//: 1행에 학생들의 점수의 합 :266  2행에 학생들의 점수의 합 :164 총합 : 430
				System.out.println(sum2);
			}
			
		}
		double avg2 = (double)sum2/student;//평균구하기 430/5 = 86
		System.out.println("전체학생의 평균점수"+(int)avg2);
		
	}
}
