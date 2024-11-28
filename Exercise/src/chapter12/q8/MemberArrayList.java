package chapter12.q8;

import java.util.ArrayList;  // ����� Ŭ���� import
import java.util.Iterator;



public class MemberArrayList {

	private ArrayList<Member> arrayList;  // ArrayList ���� 

	public MemberArrayList(){
		arrayList = new ArrayList<Member>();  //����� ������ ArrayList ����
	}
	
	public void addMember(Member member){  //ArrayList �� ��� �߰�
		arrayList.add(member);
	}
	
	public void insertMember(Member member, int position) {
		if(position <0 || position > arrayList.size()+1) {
			System.out.println("지정된 자리에 추가할 수 없습니다.");
			return;
		}
		arrayList.add(position-1, member);
	}
	
	public boolean removeMember(int memberId){
		
		for(int i =0; i<arrayList.size(); i++){
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId){
				arrayList.remove(i);
				return true;
			}
		}
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;                   
	}
	
	public void showAllMember(){
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}
}
