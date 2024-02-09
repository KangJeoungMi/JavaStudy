package com.name.buy;

public class ProductClass {
	//상품 생성
	String name;//상품 이름
	int id;//상품 번호
	int price;//상품 가격
	int count;
	
	
	ProductClass(int id, String name, int price, int count){
		this.id=id;
		this.name=name;
		this.price=price;
		this.count=count;
	}
	
	void product() {
		/*
		 * String product =
		 * "제품 번호: "+this.id+", 제품 이름: "+this.name+", 제품 가격: "+this.price+"원, 제품수량: "+this.count+"개"; 
		 * System.out.println(product);
		 */
		
		System.out.printf("제품 번호: %d, 제품 이름: %s, 제품 가격: %d원, 제품수량: %d개 \n",id,name,price,count);
	}
	
	
	
	 
	void purchase() {
		
	}
	
	
}



