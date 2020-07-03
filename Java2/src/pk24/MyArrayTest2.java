package pk24;

class MyArray<E>{
	private Object[] array = new Object[10];
	int i;
	
	public void add(E obj) {
		array[i++] = obj;
	}
	public Object get(int index) {
		return array[index];
	}
}
public class MyArrayTest2 {
	public static void main(String[] args) {
		MyArray<String> myArray = new MyArray<String>();
		MyArray myArray1 = new MyArray();
		myArray1.add(new String("test"));
		String str = (String) myArray1.get(0);//강제 형변환
		System.out.println(str);
		
		MyArray<Integer> myArray2 = new MyArray<Integer>();
		myArray2.add(new Integer(100));
		Integer num = (Integer) myArray2.get(0);//강제 형변환
		System.out.println(num);
		
	}

}
