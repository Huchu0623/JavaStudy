package pk26.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Object obj;
		Vector<Object> vec = new Vector<Object>(2);
		obj = 10;
		vec.addElement(obj); //������Ʈ �߰�
		//Vector�� �뷮 ��
		System.out.println(" �뷮 #1 ; " +vec.capacity());
		//Vector ������Ʈ ��
		System.out.println(" ũ�� #1 : " +vec.size());
		obj = "Hi";
		vec.addElement(obj);//������Ʈ �߰�
		System.out.println(" �뷮 #2 : " +vec.capacity());
		System.out.println(" ũ�� #2 : " +vec.size());
		obj = "Nice Day";
		vec.addElement(obj);
		System.out.println(" �뷮 #3 : " +vec.capacity());
		System.out.println(" ũ�� #3 : " +vec.size());
		
		System.out.println(vec);
		
		vec.remove("Hi"); 
		System.out.println(vec);
		System.out.println(" �뷮 #4 : " +vec.capacity());
		System.out.println(" ũ�� #4 : " +vec.size());
		vec.remove("Nice Day"); 
		System.out.println(vec);
		System.out.println(" �뷮 #5 : " +vec.capacity());
		System.out.println(" ũ�� #5 : " +vec.size());
	
	}

}
