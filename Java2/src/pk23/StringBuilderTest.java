package pk23;

public class StringBuilderTest {

	public static void main(String[] args) {
		//immutable
		String javaStr = new String("java");
		//처음 객체의 인스턴화시 메모리값
		System.out.println("javaStr의 문자열 주소 : " + System.identityHashCode(javaStr));
		//String으로부터 StringBuilder의 객체를 생성
		StringBuilder buffer = new StringBuilder(javaStr);
		//연산이 이루어지기 전 원본 hash값
		System.out.println("연산 전 Buffer의 메모리 주소 : " + System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append("android");
		buffer.append(" programming is fun!");
		System.out.println("연산 후 Buffer의 메모리 주소 : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		
		System.out.println("새로 만들어진 javaStr의 문자열 주소 : " + System.identityHashCode(javaStr));
	}

}
