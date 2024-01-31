package ch01;

public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = "+(45 & 25));
		System.out.println("45 | 25 = "+(45 | 25));
		System.out.println("45 ^ 25 = "+(45 ^ 25));
		System.out.println("~45 = "+(~45 ));
		System.out.println("-----------");
		
		byte recieveData = -120;
		
		int INt1 = recieveData&255;
		System.out.println(INt1);
		
		int INt2 = Byte.toUnsignedInt(recieveData);
		System.out.println(INt2);
		
		int test = 136;
		byte btest  = (byte)test;
		System.out.println(btest);
	}
}
