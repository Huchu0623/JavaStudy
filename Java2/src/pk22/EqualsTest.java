package pk22;

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		//다른 주소를 갖고 있는 객체의 물리적 논리적 비교
		if(studentLee == studentLee2) 
			System.out.println("주소가 같다.");
			else
				System.out.println("주소가 다르다.");
		
		
		if(studentLee.equals(studentLee2)) 
			System.out.println("주소가 같다.");
		else
			System.out.println("주소가 다르다.");

		if(studentLee == studentSang) 
			System.out.println("주소가 같다");
		else
			System.out.println("주소가 다르다.");
		
		if(studentLee.equals(studentSang)) 
			System.out.println("주소가 같다");
		else
			System.out.println("주소가 다르다.");
		//HashCode 인스턴스 생성시 만들어 지는 heap 메모리 주소
		System.out.println("studentLee의 hashcode 값 : " + studentLee.hashCode());
		System.out.println("studentSang의 hashcode 값 : " + studentSang.hashCode());
		
		//인스턴트 전에 주어지는 실제주소
		System.out.println("studentLee의 실제 주소 값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소 값 : " + System.identityHashCode(studentSang));
	} 
      
}     
      