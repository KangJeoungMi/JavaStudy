package 컬렉션;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이 1"));
		list.add(new Board("제목2", "내용2", "글쓴이 2"));
		list.add(new Board("제목3", "내용3", "글쓴이 3"));
		list.add(new Board("제목4", "내용4", "글쓴이 4"));
		
		int size = list.size();
		System.out.println(size);
		
		Board board = list.get(2);
		System.out.println(board.getSubject()+board.getContent()+board.getWriter());
		
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject()+b.getContent()+b.getWriter());
		}
		
		list.remove(2);
		list.remove(2);
		
		for(Board b :list) {
			System.out.println(b.getSubject()+b.getContent()+b.getWriter());
		}
		
	}
}
