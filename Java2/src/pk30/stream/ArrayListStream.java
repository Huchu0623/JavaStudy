package pk30.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		//���׸� Ÿ���� stream����
		Stream<String> stream = sList.stream();
		//���ٽ� ��� ; stream�� �����Ͽ� �ϳ��� Element�� ������ ����س��� ���ٽ�
		stream.forEach(s->System.out.print(s + " "));
		System.out.println();
		sList.stream().sorted().forEach(s->System.out.print(s + " "));
		System.out.println();
		sList.stream().map(s->s.length()).forEach(str->System.out.print(str + " "));
		/*for(String s:sList) {
		 * System.out.println(s);
		 */
				

	}

}
