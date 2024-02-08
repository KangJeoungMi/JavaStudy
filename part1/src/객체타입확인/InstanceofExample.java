
package 객체타입확인;


public class InstanceofExample {
	public static void main(String[] args) {

		Bus B = new Bus();
		Taxi T = new Taxi();
		
		ride(T);
		System.out.println();
		ride(B);
		
	}
	
	public static void ride(Vehicle V) {
		//방법 1
		//if(V instanceof Bus) {
		//	Bus B = (Bus)V;
		//	B.CheckFare;
		//}
		//방법 2
		if(V instanceof Bus B) {
			B.CheckFare();
		}
	}

}
