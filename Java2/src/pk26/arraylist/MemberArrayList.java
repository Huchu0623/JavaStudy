package pk26.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import pk26.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList; //ArrayList ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //Member�� ������ ArrayList�� �ν��Ͻ�ȭ ��
		
	}
	
	public void addMember(Member member) {//ArrayList�� Member �߰�
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) {//�ɹ����̵� �Ű�������, �������θ� ��ȯ
		
		for(int i =0; i<arrayList.size(); i++) {//�ش� ���̵� ���� �ɹ��� ArrayList���� ã��
			Member member = arrayList.get(i);
			int tempId = member.getMemberId(); 
			if(tempId == memberId) { //�ɹ����̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i); //�ش� �ɹ��� ����
				return true; //true��ȯ
			}
			
		}
		/*System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}*/
	
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {// �ɹ����̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(member);//�ش� �ɹ��� ����
				return true;
				} //true ��ȯ
			}
		return false;
	}

	public void showAllMember() {
			for(Member member : arrayList) {
				System.out.println(member);
			}
			System.out.println();
			System.out.println(arrayList);
		
	}
}
