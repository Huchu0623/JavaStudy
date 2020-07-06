package pk26.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		
		Board board1 = new Board("subject1", "content1", "writer1");
		Board board2 = new Board("subject2", "content2", "writer2");
		Board board3 = new Board("subject3", "content3", "writer3");
		Board board4 = new Board("subject4", "content4", "writer4");
		Board board5 = new Board("subject5", "content5", "writer5");
		
		
		list.add(board1);
		list.add(board2);
		list.add(board3);
		list.add(board4);
		list.add(board5);
		
		list.remove(2);
		list.remove(3);
		System.out.println("==============================================");
		
		for(int i = 0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
	}

}
