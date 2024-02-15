package 스레드;

public class Cal {
	private int memory;
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setmemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
			
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+this.memory);
	}
	
	public  void setmemory2(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
				
			}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+this.memory);
		}
		
		
	}
}
