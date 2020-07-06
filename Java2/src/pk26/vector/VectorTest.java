package pk26.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Object obj;
		Vector<Object> vec = new Vector<Object>(2);
		obj = 10;
		vec.addElement(obj); //엘리먼트 추가
		//Vector의 용량 수
		System.out.println(" 용량 #1 ; " +vec.capacity());
		//Vector 엘리먼트 수
		System.out.println(" 크기 #1 : " +vec.size());
		obj = "Hi";
		vec.addElement(obj);//엘리먼트 추가
		System.out.println(" 용량 #2 : " +vec.capacity());
		System.out.println(" 크기 #2 : " +vec.size());
		obj = "Nice Day";
		vec.addElement(obj);
		System.out.println(" 용량 #3 : " +vec.capacity());
		System.out.println(" 크기 #3 : " +vec.size());
		
		System.out.println(vec);
		
		vec.remove("Hi"); 
		System.out.println(vec);
		System.out.println(" 용량 #4 : " +vec.capacity());
		System.out.println(" 크기 #4 : " +vec.size());
		vec.remove("Nice Day"); 
		System.out.println(vec);
		System.out.println(" 용량 #5 : " +vec.capacity());
		System.out.println(" 크기 #5 : " +vec.size());
	
	}

}
