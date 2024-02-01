package chapter03_조건문_반복문;

public class SumForm1To100Example {

	public static void main(String[] args) {
		int sum=0;
		int i= 1;
		
		while(i<=100) {
			sum +=i;
			i++;
			
		}
		System.out.println("1~"+(i+1)+"합 : "+sum);
		
		//While문 1~10
		
		int j = 1;
		while(j<=10) {
			System.out.println(j+"");
			j++;
		}
		//for문 1~10 
		for (int a=1; a<=10; a++) { 
			System.out.println(a); 
			}
		 
	}

}
