package lotto;

import java.util.Scanner;
import java.util.Random;

public class lottery {
	
	static int[] mynum = new int[6];
	static int[] num = new int[6];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 로또 수동 뽑기 자동뽑기 결정
		while (true) {
			System.out.print("1. 자동 | 2. 수동 : ");

			String autoRan = sc.nextLine();

			if (autoRan.equals("자동") || autoRan.equals("1")) {
				mylotto();
				break;
			} else if (autoRan.equals("수동") || autoRan.equals("2")) {
				System.out.println("수동입니다");
				break;
			}
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println("(〜￣▽￣)〜 로또 추첨 〜(￣▽￣〜)");
		Random();
		
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println("(〜￣▽￣)〜 로또 발표 〜(￣▽￣〜)");
		// mylotto() 함수에서 선택된 번호 출력
		 int cont = 0;
         for (int i = 0; i < 6; i++) {
             for (int j = 0; j < 6; j++) {
                 if (mynum[i] == num[j]) {
                     cont++;
                 }
             }
         }
         
         if(cont == 0) {
        	 System.out.println("꼴등");
        	 System.out.println("아쉽네요 (ノへ￣、)");
        	 }else if(cont == 1) {
        		 System.out.println("5등");
        		 }else if(cont == 2) {
        			 System.out.println("4등");
                	 System.out.println(" o(*^▽^*)┛ 당첨금을 수령하세요!");
        			 } else if(cont == 3) {
        	 System.out.println("3등");
        	 System.out.println(" o(*^▽^*)┛ 당첨금을 수령하세요!");
        	 } else if(cont == 4) {
        	 System.out.println("2등");
        	 System.out.println(" o(*^▽^*)┛ 당첨금을 수령하세요!");
        	 } else if(cont == 5) {
        	 System.out.println("1등");
        	 System.out.println("축하드립니다. 당첨금을 수령하러 은행으로 가주세요.");
         }
         sc.close();

	}

	public static void mylotto() {
		Scanner sc = new Scanner(System.in);

		Random myrand = new Random();

		System.out.print("로또 구매 갯수 (1~5): ");
		int buy = sc.nextInt();
		System.out.print("내 로또 번호 ");

		for (int n = 0; n < buy; n++) {
			if (buy > 5) {
				System.out.println("구매 불가");
				System.out.print("로또 구매 갯수 (1~5): ");
				buy = sc.nextInt();
				System.out.print("내 로또 번호 ");
			}

			System.out.println(" ");
			for (int i = 0; i < 6; i++) {

				mynum[i] = myrand.nextInt(45) + 1;
				System.out.print("[" + mynum[i] + "]");

				// 중복 제거
				for (int j = 0; j < i; j++) {
					if (mynum[i] == mynum[j]) {
						j--;
					}
				}
			}
		}
		sc.close();
	}

	public static void Random() {// 자동 뽑기

		// 로또 : 1~45까지의 숫자 중 6개의 숫자만 추출 한다
		// Random().nextInt(bound)를 사용하면 0~bound의 수가 나타남
		// Random().nextInt(45) : 0~44의 숫자를 뽑는다 따라서 45까지의 숫자를 뽑기위해 +1 을 해야한다

		Scanner sc = new Scanner(System.in);


		Random rand = new Random();

		System.out.println("이번주 로또번호");
		for (int i = 0; i < 6; i++) {
			num[i] = rand.nextInt(45) + 1;
			System.out.print("[" + num[i] + "]");

			// 중복 제거
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					j--;
				}
			}
		}
		sc.close();
	}

	public static void self() {// 수동 뽑기

	}

}
