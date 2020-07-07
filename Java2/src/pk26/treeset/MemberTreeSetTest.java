package pk26.treeset;

import pk26.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
	MemberTreeSet memberTreeSet = new MemberTreeSet();
	Member memberLee=new Member(1003,"������");
	Member memberSon=new Member(1002,"�չα�");
	Member memberPark=new Member(1001,"�ڼ���");
	
	memberTreeSet.addMember(memberLee);
	memberTreeSet.addMember(memberSon);
	memberTreeSet.addMember(memberPark);
	memberTreeSet.showAllMember();
	
	System.out.println("=====================");
	
	Member memberHong=new Member(1003,"ȫ�浿"); //1003 memberId�ߺ�
	memberTreeSet.addMember(memberHong);
	memberTreeSet.showAllMember();
	
	
	}
}
