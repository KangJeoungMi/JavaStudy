package 컬렉션;

import java.util.List;
import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		Thread ThreadA = new Thread() {
			public void run() {
				for(int i=0; i<=1000; i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};
		Thread ThreadB = new Thread() {
			public void run() {
				for(int i=0; i<=1000; i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};
		
		ThreadA.start();
		ThreadB.start();
		
		
		try {
			ThreadA.join();
			ThreadB.join();
		}catch(Exception e) {}
		
		int size = list.size();
		
		System.out.println(size);
	}
}
