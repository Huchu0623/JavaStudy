package pk26.arraylist;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Object obj;
		//empty ���û���
		Stack<Object> st = new Stack<Object>();
		
		if(st.empty()) {
			for(int i=0; i<3; i++) {				
		st.push(new String("Hi!"+i));
		System.out.println("�Է�" + i + "��° : " + st.peek());
			}
		}//of
		st.pop();
		System.out.println("���� Top�� ��ġ (peek) : " + st.peek());
		st.pop();
		System.out.println("���� Top�� ��ġ (peek) : " + st.peek());
		
	}

}
