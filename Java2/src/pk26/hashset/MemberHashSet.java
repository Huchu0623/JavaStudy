package pk26.hashset;

import java.util.HashSet;
import java.util.Iterator;

import pk26.Member;

public class MemberHashSet {
	//static -> data영역에 들어감 -> 사용이 한정됨
	//지역변수는 스택메모리에 쌓이고 -> 사용하면 사라짐	
	//인스턴스변수 ->heap메모리에서 값을 저장하고 얻어옴
	
	//HashSet 타입의 필드 생성(인스턴스 변수)
	private HashSet<Member> hashSet;
	
	//생성자 overriding을 통해서 HashSet의 객체생성
	public MemberHashSet() {
		hashSet=new HashSet<Member>();
	}
	//hashSet에 객체추가
	public void addMember(Member member) {
		hashSet.add(member);
	}
	//HashSet에선 get을 제공하지 않음 그러므로 순회하는 Iterator를 통하여 값을 비교 판단해야함
	public boolean removeMember(int memberId) {
	Iterator<Member> ir = hashSet.iterator();	//get(i)을 제공하지 않음
		while(ir.hasNext()) {	//hasNext: 다음 객체 존재 판단하여 진행하는 메소드
			Member member=ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {	//멤버아이디가 매개변수와 일치하면
				hashSet.remove(member);	//해당 멤버를 삭제
				return true;	//true반환
			}
		}
		System.out.println(memberId+"아이디가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}System.out.println();
	}
}