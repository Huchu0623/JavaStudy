package pk26.hashset;

import pk26.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet=new MemberHashSet();

		Member memberLee=new Member(1003,"������");
		Member memberSon=new Member(1002,"�չα�");
		Member memberPark=new Member(1001,"�ڼ���");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		System.out.println("=====================");
		
		Member memberHong=new Member(1003,"ȫ�浿"); //1003 memberId�ߺ�
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		
		
		//HaseSet�� ���� ���Ǵ��Ͽ� �Է��ϴµ�  equals�� hashcode�� ������ ������ ������ �������� �ߺ� ���θ� �Ǵ��� ���� ��� �ߺ��� ����Ѵ�.
		//String �Ǵ� Integer ���� �̹� JDK���� �������Ͽ��� JVM(������ �� �۵�)���� �����ϹǷ� �ߺ��� �����
		//�׷��Ƿ� Member���� equals,hashcode overlide�ʿ�
		
		//������ comparable�� ���Ͽ� ������ ���־�� �����ϴ�(String �Ǵ� Integer ���� �̹� �Ǿ�����)
	}

}



