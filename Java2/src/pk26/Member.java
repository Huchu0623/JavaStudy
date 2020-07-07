package pk26;

//import java.util.Comparator;	//동기화 시킬때 vector로 들어와서 Comparator 사용

public class Member implements Comparable<Member>{	//동기화
//public class Member{
//Comparator<Member>
//Comparabler<Member>	
	private int memberId;
	private String memberName;
//	public Member() {};	//디폴트 생성자(comparator<Member>)
	public Member(int memberId, String memberName) {	//생성자
		this.memberId=memberId;
		this.memberName=memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {

		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member=(Member)obj;
			
			if(memberId==member.memberId) 
				return true;
			else
				return false;
		}
		return false;
	}
	

	@Override
	public String toString() {
		//출력 문장
		return memberName + "님의 아이디는 " + memberId+"입니다.";
	}
//
//	@Override
//	public int compare(Member member1, Member member2) {
//		 
//		return (member1.memberId - member2.memberId); //오름차순
//	}

	//@Override
	public int compareTo(Member member) {
		
		return (this.memberId - member.memberId);	//오름차순
	//	return (this.memberId - member.memberId) * (-1); 	//내림차순
//		return (this.memberName.compareTo(member.memberName));	//이름기준 오름차순
//		return (this.memberName.compareTo(member.memberName)) * (-1); //이름기준 내림차순
	}
	
}