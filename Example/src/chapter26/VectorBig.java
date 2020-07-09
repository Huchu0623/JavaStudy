package chapter26;

import java.util.Scanner;
import java.util.Vector;

//-1�� �Էµ� ������ vector�� �ڷ�(Integer) �����ϰ� �ִ밪�� ����ϴ� �˰���


public class VectorBig {
	//�� �ʱ�ȭ �� �ڷ�� �ڽ��� ���� ũ�ٰ� �˰� �ֱ� ������ printBig�޼ҵ带 �̿��Ͽ� ũ�⸦ ���ؾ���
	public static void printBig(Vector<Integer> v) {
		int big = v.get(0); //�񱳴���� �����Ƿ� ù��°�� ������ �ִ밪���� �����
		
		for(int i=0; i<v.size(); i++) {
			if(big<v.get(i))//�� ū���� ã������ ���Ǵ�
				big = v.get(i);//ū���� big�����濡 �����ϱ�
		}
		System.out.println("���� ū ���� : " + big);
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		
		//�Է�
		System.out.println("������ �Է��ϼ��� (-1�� �ԷµǸ� ����)");
		while(true) {
			int n = sc.nextInt();
			if(n == -1)
				break;
				v.add(n);	
		}
		if(v.size() == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
			sc.close();
			return;
		}
		System.out.println("--���� ū ��--");
		printBig(v);//���� ū ���� ���
		
		sc.close();
	}
}
