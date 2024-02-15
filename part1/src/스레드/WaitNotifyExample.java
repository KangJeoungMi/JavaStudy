package 스레드;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA A = new ThreadA(workObject);
		ThreadB B = new ThreadB(workObject);
		
		A.start();
		B.start();
	}
}
