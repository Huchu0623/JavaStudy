package chapter23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		//�Է���
		while(true) {//"�׸�"�� �Էµ� ������ �Է��� �ݺ�
			System.out.println("���� �̸�, �α�>> ");
			//scanner�� �Է¹��� ���� �����濡 ����
			String nation = scanner.next();
			//�����濡 �׸��̶�� ���ڰ� ������ break(equals���)
			if (nation.equals("�׸�")) 
				break;  // �Է� ����
			//�α��� �Է¹޾� population�����濡 ���� scanner.nextInt();
			int population = scanner.nextInt();
			//nations.put
			nations.put(nation, population);//
		
			
		}
			//�α��˻�
			while(true) {
				System.out.println("�α� �˻��� ������� �Է��ϼ���>> ");
				//scanner�� �Է¹���
				String nation = scanner.next();
			
				//�����濡 �׸��̶�� ���ڰ� ������ break(equals���)
				if (nation.equals("�׸�")) 
					break;  // �Է� ����
				//nations.get���� �α� �����ؼ� �����濡 ����
				Integer n = nations.get(nation);
				if(n == null) 
					System.out.println(nation + "���� ����");
				
				else 
					System.out.println(nation + "�� �α��� "+n);				
				}
				scanner.close();
				
			}
			
				}
			
		
		
	


