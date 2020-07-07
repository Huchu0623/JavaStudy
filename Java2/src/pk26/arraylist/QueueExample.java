package pk26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("send Mail", "ȫ�浿"));
		messageQueue.offer(new Message("send SMS", "�Ӳ���"));
		messageQueue.offer(new Message("send kakaotalk", "ȫ�α�"));
		//empty : �񵿱�ȭ�� �����ϸ鼭 ����ִ� ����0���� True�� ��ȯ
		//isEmpty: ����ȭ�� �����ϸ� null�� ����(�� ��ü�� ��ư� �����Ƿ� ��������� null������ �ʱ�ȭ��)
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "send Mail" : 
				System.out.println(message.to + "���� ������ ���´�.");
				break;
			case "send SMS" :
				System.out.println(message.to + "����  SMS�� ���´�." );
				break;
			case "send kakaotalk" :
				System.out.println(message.to + "���� īī������ ���´�.");	
				break;
			}
			
		}
		
	}

}
