package pk26.arraylist;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		//4�� �̻� push	
		
		
			coinBox.push(new Coin(100));
			coinBox.push(new Coin(200));
			coinBox.push(new Coin(300));
			coinBox.push(new Coin(400));
			coinBox.push(new Coin(50));
			
		
			//coin�� ���� ������ �ݺ��Ͽ� pop�ϱ�
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("������ ���� : " + coin.getValue()+"��");
		}
			}
			
		
	
}