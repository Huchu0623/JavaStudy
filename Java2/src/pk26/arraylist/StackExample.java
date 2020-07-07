package pk26.arraylist;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		//4번 이상 push	
		
		
			coinBox.push(new Coin(100));
			coinBox.push(new Coin(200));
			coinBox.push(new Coin(300));
			coinBox.push(new Coin(400));
			coinBox.push(new Coin(50));
			
		
			//coin이 없을 때까지 반복하여 pop하기
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue()+"원");
		}
			}
			
		
	
}
