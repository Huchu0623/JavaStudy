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
		
		//ÃÑ °´Ã¼¼ö
		//int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö : " + list.size());
		System.out.println("====================");
		//for ->size, get»ç¿ë
		/*String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();*/
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
			System.out.println("==================");
			
		//»èÁ¦	
			list.remove(1);
			list.remove("Spring");
		
		//for
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			System.out.println();
		}

}
