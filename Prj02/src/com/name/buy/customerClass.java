package com.name.buy;

public class customerClass {
//회원 생성
	String name;//회원 이름
	int id;//회원 번호
	int age;//회원 나이
	
	customerClass(int id, String name, int age){
		this.id=id;
		this.age=age;
		this.name=name;
	}
	
	void custominfo() {
		String msg="회원 번호: "+this.id+", 회원 이름: "+this.name+", 회원 나이: "+this.age;
		msg += "인 회원 생성";
		System.out.println(msg);
	}
	
}
