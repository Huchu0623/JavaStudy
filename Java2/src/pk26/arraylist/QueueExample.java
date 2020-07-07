package pk26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("send Mail", "홍길동"));
		messageQueue.offer(new Message("send SMS", "임꺽정"));
		messageQueue.offer(new Message("send kakaotalk", "홍두깨"));
		//empty : 비동기화를 제공하면서 비어있는 공간0으로 True값 반환
		//isEmpty: 동기화를 제공하며 null값 인지(즉 객체가 들아가 있으므로 비어있으면 null값으로 초기화됨)
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "send Mail" : 
				System.out.println(message.to + "에게 메일을 보냈다.");
				break;
			case "send SMS" :
				System.out.println(message.to + "에게  SMS를 보냈다." );
				break;
			case "send kakaotalk" :
				System.out.println(message.to + "에게 카카오톡을 보냈다.");	
				break;
			}
			
		}
		
	}

}
