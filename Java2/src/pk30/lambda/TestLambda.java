package pk30.lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		//���ٽ��� ������ ����
		PrintString lambdaStr = s->System.out.println(s);
		lambdaStr.showString("hello lambda_1");
			
	//�Լ��� ���� ����1         
	showMyString(lambdaStr); //lambdaStr : ���ٽ� ��ü
		//s->System.out.println(s); ����Ǿ� lambdaStr�� �������
	
		//�Լ��� ���� ����2 
		PrintString reStr = returnString();
		reStr.showString("Hello");
	}
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
	public static PrintString returnString() {
		return s->System.out.println(s + " " + "lambda_3 ");
		
	}
	
}
