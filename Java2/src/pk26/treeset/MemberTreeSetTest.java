package pk26.treeset;

import pk26.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
	MemberTreeSet memberTreeSet = new MemberTreeSet();
	Member memberLee=new Member(1003,"ÀÌÁö¿ø");
	Member memberSon=new Member(1002,"¼Õ¹Î±¹");
	Member memberPark=new Member(1001,"¹Ú¼­ÈÍ");
	
	memberTreeSet.addMember(memberLee);
	memberTreeSet.addMember(memberSon);
	memberTreeSet.addMember(memberPark);
	memberTreeSet.showAllMember();
	
	System.out.println("=====================");
	
	Member memberHong=new Member(1003,"È«±æµ¿"); //1003 memberIdÁßº¹
	memberTreeSet.addMember(memberHong);
	memberTreeSet.showAllMember();
	
	
	}
}
