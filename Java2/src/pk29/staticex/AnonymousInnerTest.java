package pk29.staticex;


class Outter2{
	//�ʵ�
	int outNum = 100;
	static int sNum = 200;
	//�޼ҵ�
	Runnable getRunnable(int i) {//�Ű������� final�� ó���Ǿ� �ٸ� Ŭ�������� ���x
		int num = 100;//������������ ���ȭ final
		int localnum =10;
		//�͸��� Ŭ����
			return new Runnable() {
			@Override
			public void run() {
				//num=200;	
				//i=20;
				System.out.println("localNum : " + localnum + " ����Ŭ������ �ν��Ͻ� ����");
				System.out.println("outNum : " + outNum + " �ܺ�Ŭ������ �ν��Ͻ� ����");
				System.out.println("Outter-static : " + sNum + " �ܺ�Ŭ������ ��������");
			}	
		};	
	}
	/*���ο��� �۵����� ��ü
	Runnable runner = new Runnable(){

}*/
}
public class AnonymousInnerTest {

	public static void main(String[] args) {
		
		Outter2 out = new Outter2();
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}
