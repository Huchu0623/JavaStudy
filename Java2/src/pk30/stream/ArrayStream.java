package pk30.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayStream {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		Arrays.stream(arr).forEach(n->System.out.println(n));
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("arr�� �հ�: " + sum);
		System.out.println("-----------------");
		
		//��ü�̸� : list
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Stream<Integer> stream = list.stream();
		int sum2 = list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println("ArrayList�� �հ� : " + sum2);
		
		

	}

}
