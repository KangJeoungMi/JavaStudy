package 스레드;

public class WorkThread extends Thread{
	public boolean work = true;
	public WorkThread(String name) {
		setName(name);
	}
	public void run() {
		while(true) {
			if (work) {
				System.out.println(getName());
			}else {
				Thread.yield();
			}
		}
	}

}
