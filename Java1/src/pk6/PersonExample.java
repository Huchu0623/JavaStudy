package pk6;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","홍길동");
		
		System.out.println("국가 :  " + p1.nation);
		System.out.println("주민번호 : " + p1.ssn);
		
		p1.name = "이름 : 홍삼원";
		
		//p1.nation = "국가 : usa"; p1.ssn = "238123-3242343"//final이 있어서 변경x(fix되어있음)
		
		System.out.println(p1.name);
	}

}
