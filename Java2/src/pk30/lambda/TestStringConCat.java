package pk30.lambda;

public class TestStringConCat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		//��ü���� ���
		StringConcatImpl concat = new StringConcatImpl();
		concat.makeString("��ü���� : " + s1, s2);
	
		//���ٽ�(������ ����)
		StringConcat concat2 = (s,v)->System.out.println( "���ٽ� : " + s + " " + v);
		concat2.makeString(s1, s2);
		
		//�͸��� Ŭ����
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println("�͸���Ŭ���� : "+ s1 + " " + s2);
			}
			
		};
		concat3.makeString(s1, s2);
	
	}

}