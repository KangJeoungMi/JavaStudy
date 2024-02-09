package com.name.buy;

public class ExecClass {
	public static void main(String[] args) {
		//1.회원 등록
		customerClass c1 = new customerClass(1,"홍길동",20);
		//c1.name="홍길동";
		customerClass c2 = new customerClass(2,"장보고",30);

		customerClass c3 = new customerClass(2,"이몽룡",25);
		
		c1.custominfo();
		c2.custominfo();
		c3.custominfo();
		System.out.println();
		
		
		//2. 상품등록 : 새우깡(100-1000원), 콜라(500-2000원), 천하장사(1000-800원), 빼빼로(300-1500원), 사이다(500-2000원)
		ProductClass p1 = new ProductClass(001, "새우깡",1000,100);
		ProductClass p2 = new ProductClass(002, "콜라", 2000,500);
		ProductClass p3 = new ProductClass(003, "천하장사", 800,1000);
		ProductClass p4 = new ProductClass(004, "빼빼로",1500,300);
		ProductClass p5 = new ProductClass(005, "사이다", 2000,500);
		
		p1.product();
		p2.product();
		p3.product();
		p4.product();
		p5.product();
		
		
		//3. 상품 구매 - 장바구니에 담기
		c3.addToCart(p1, 20,0);
		c3.addToCart(p2, 20,1);
		c3.addToCart(p1, 90,3);
		//4. 상품 구매 - 결재
		//c3.purchase();
		
		
		
	}
	
}
