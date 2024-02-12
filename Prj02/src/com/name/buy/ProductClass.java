package product;

public class ProductClass {
	//상품 생성
	String Pname;//상품 이름
	int id;//상품 번호
	int price;//상품 가격
	int count;
	
	
	ProductClass(int id, String Pname, int price, int count){
		this.id=id;
		this.Pname=Pname;
		this.price=price;
		this.count=count;
	}
	
	void product() {
		System.out.printf("제품 번호: %d, 제품 이름: %s, 제품 가격: %d원, 제품수량: %d개 \n",id,Pname,price,count);
	}
	
	
	
	 
	void purchase() {
		
	}
	
	
}



