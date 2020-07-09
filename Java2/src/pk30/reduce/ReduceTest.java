package pk30.reduce;

import java.util.Arrays;

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다.^^"};
		
//		//reduce의 문법(초기값, 매개변수, 실행부)
//		reduce("", (s1, s2)->
//		{if(s1.getBytes().length >= s2.getBytes().length) 
//			return s1;
//		else return s2;})

		//Stream에 적용
//		Arrays.stream(greetings).reduce("", (s1, s2)->
//		{if(s1.getBytes().length >= s2.getBytes().length) 
//			return s1;
//		else return s2;})
		
		//결과 출력
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)->
		{if(s1.getBytes().length >= s2.getBytes().length) 
			return s1;
		else return s2;}));
		System.out.println();
//-------------------------------------------------------------------------------------		
		//BinaryOperator를 구현한 클래스 이용 실습
		//클래스를 이용할때는 초기값은 생략된다
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	//  System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get();
	}

}
