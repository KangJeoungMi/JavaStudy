package chapter03_조건문_반복문;

import java.util.Iterator;

public class sumFrom1To100Example {
	public static void main(String[] args) {
		int sum=0;
		int i;
		
		for (i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println("1~"+(i-1)+"합 : "+sum);
	}

}
