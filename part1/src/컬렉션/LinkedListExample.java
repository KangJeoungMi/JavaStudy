package 컬렉션;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		
		long starttime;
		long endTime;
		
		starttime = System.nanoTime();
		for(int i=0; i<1000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println(endTime-starttime);
		
		starttime = System.nanoTime();
		for(int i=0; i<1000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println(endTime-starttime);
		
	}
}
