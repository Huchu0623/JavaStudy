package pk22;

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "�̻��");
		
		//�ٸ� �ּҸ� ���� �ִ� ��ü�� ������ ���� ��
		if(studentLee == studentLee2) 
			System.out.println("�ּҰ� ����.");
			else
				System.out.println("�ּҰ� �ٸ���.");
		
		
		if(studentLee.equals(studentLee2)) 
			System.out.println("�ּҰ� ����.");
		else
			System.out.println("�ּҰ� �ٸ���.");

		if(studentLee == studentSang) 
			System.out.println("�ּҰ� ����");
		else
			System.out.println("�ּҰ� �ٸ���.");
		
		if(studentLee.equals(studentSang)) 
			System.out.println("�ּҰ� ����");
		else
			System.out.println("�ּҰ� �ٸ���.");
		//HashCode �ν��Ͻ� ������ ����� ���� heap �޸� �ּ�
		System.out.println("studentLee�� hashcode �� : " + studentLee.hashCode());
		System.out.println("studentSang�� hashcode �� : " + studentSang.hashCode());
		
		//�ν���Ʈ ���� �־����� �����ּ�
		System.out.println("studentLee�� ���� �ּ� �� : " + System.identityHashCode(studentLee));
		System.out.println("studentSang�� ���� �ּ� �� : " + System.identityHashCode(studentSang));
	} 
      
}     
      