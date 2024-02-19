package 람다식;

public class Person2 {
	public void ordering(Comparable comparable) {
		String a = "홍";
		String b = "김";
		
		int result = comparable.compare(a,b);
		
		if(result<0) {
			System.out.println(a+">"+b);
		}else if(result == 0) {
			System.out.println(a+"="+b);
		}else {
			System.out.println(a+"<"+b);
		}
	}
}
