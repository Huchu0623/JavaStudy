package pk26.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("DATABASE");
		list.add("Spring");
		
		//�� ��ü��
		//int size = list.size();
		System.out.println("�� ��ü�� : " + list.size());
		System.out.println("====================");
		//for ->size, get���
		/*String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();*/
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
			System.out.println("==================");
			
		//����	
			list.remove(1);
			list.remove("Spring");
		
		//for
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			System.out.println();
		}

}
