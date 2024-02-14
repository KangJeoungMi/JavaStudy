package objectClass;

public class EqualsExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("yellow");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1==obj2(o)");
		}else {
			System.out.println("obj1==obj2(x)");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1==obj3(o)");
		}else {
			System.out.println("obj1==obj3(x)");
		
		}
	}

}
