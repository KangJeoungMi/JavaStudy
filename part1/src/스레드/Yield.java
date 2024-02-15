package 스레드;

public class Yield {
	public static void main(String[] args) {
		WorkThread A = new WorkThread("A");
		WorkThread B = new WorkThread("B");
		
		A.start();
		B.start();
		
		try {Thread.sleep(5000);} catch(InterruptedException e){}
		A.work = false;
		try {Thread.sleep(10000);} catch(InterruptedException e){}
		B.work = true;
		
	}

}
