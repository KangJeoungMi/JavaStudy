package com.name.buy;

public class customerClass {
//회원 생성
	String name;//회원 이름
	int id;//회원 번호
	int age;//회원 나이
	
	ProductClass[] Basket= new ProductClass[10];//상품을 저장할 장바구니
	
	customerClass(int id, String name, int age){
		this.id=id;
		this.age=age;
		this.name=name;
	}
	
	customerClass(int id, String name, int age, ProductClass[] Basket){
		this.id=id;
		this.age=age;
		this.name=name;
		this.Basket=Basket;	
	}
	
	void custominfo() {
		String msg="회원 번호: "+this.id+", 회원 이름: "+this.name+", 회원 나이: "+this.age;
		msg += "인 회원 생성";
		System.out.println(msg);
	}
	
	public void addToCart(ProductClass product, int count, int index) {
		
		if(product.count<count) {
			System.out.println("못산다");
			
		}else {
			product.count -= count;
			System.out.println(product.name+count+"개 들어간다");
		}
		
		Basket[index] = product;//바스켓

	}
	
	
	public void addCart (String Pname, int count) {
		//새우깡을 20개 담았다
		for (int i=0; i<procu)
	}
	
	
}


