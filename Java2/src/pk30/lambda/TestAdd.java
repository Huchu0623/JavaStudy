package pk30.lambda;

public class TestAdd {
public static void main(String[] args) {
	
	Add addF = (x,y)-> x+y; //구현부
	
	System.out.println(addF.add(3, 5)); //실행부
	
	Add addA = new Add() {
		
		@Override
		public int add(int x, int y) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
}
}
