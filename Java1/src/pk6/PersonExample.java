package pk6;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","ȫ�浿");
		
		System.out.println("���� :  " + p1.nation);
		System.out.println("�ֹι�ȣ : " + p1.ssn);
		
		p1.name = "�̸� : ȫ���";
		
		//p1.nation = "���� : usa"; p1.ssn = "238123-3242343"//final�� �־ ����x(fix�Ǿ�����)
		
		System.out.println(p1.name);
	}

}
