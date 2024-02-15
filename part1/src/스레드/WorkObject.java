package 스레드;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+"method B");
		notify();
		try {wait();}catch(InterruptedException e){}
	}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+"method B");
		notify();
		try {wait();}catch(InterruptedException e){}
	} 
}
