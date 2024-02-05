package 가변길이매개변수;

public class Computer {

	int sum(int ... vlaues) {
		int sum = 0;
		
		for (int i=0; i<vlaues.length; i++) {
			sum+= vlaues[i];
			
		}
		
		return sum;
	}
}
