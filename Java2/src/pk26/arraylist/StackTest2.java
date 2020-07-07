package pk26.arraylist;

import java.util.ArrayList;

class MyStack{
		private ArrayList<String> arrayStack = new ArrayList<String>();
		
		public void push(String data) {
			arrayStack.add(data);
		}
		
		public String pop() {
			int len = arrayStack.size();
			if(len == 0) {
				System.out.println("스택이 비었습니다.");
				 return null;
			}
			return(arrayStack.remove(len-1));
		}
}

public class StackTest2 {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		
		System.out.println("첫번째 "+stack.pop());
		System.out.println("두번째 "+stack.pop());
		System.out.println("세번째 "+stack.pop());
		System.out.println("네번째 "+stack.pop());
		System.out.println("다섯번째 "+stack.pop());
		

	}

}
