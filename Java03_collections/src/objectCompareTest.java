import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class objectCompareTest {

	public objectCompareTest() {
		//객체내의 특정 필드로 정렬하기 
		List<Member> lst = new ArrayList<Member>();
		
		lst.add(new Member(4, "홍길동", "010-1111-1234", "강원도 삼척시"));
		lst.add(new Member(3, "이순신", "010-5555-1587", "부산광역시"));
		lst.add(new Member(1, "세종대왕", "010-2222-7777", "서울시 중구"));
		lst.add(new Member(2, "김정희", "010-8888-9999", "경기도 안산시"));
		lst.add(new Member(0, "장영실", "010-9999-7777", "대전직할시"));
		
		System.out.println("==========정렬전=========");
		for(Member mem : lst) {
			mem.memberPrn();
		}
		System.out.println("===========이름을 이용한 내림차순============");
		//정렬하기
		Collections.sort(lst, new CompareNameDesc());
		for(Member mem : lst) {
			mem.memberPrn();
		}
		System.out.println("===========이름을 이용한 오름차순 정렬==========");
		Collections.sort(lst, new CompareNameAsc());
		for(Member mem : lst) {
			mem.memberPrn();
		}
		System.out.println("========번호를 이용한 오름차순========");
		Collections.sort(lst, new CompareNoAsc());
		for(Member mem : lst) {
			mem.memberPrn();
		}
		System.out.println("========번호를 이용한 내림차순========");
		Collections.sort(lst, new CompareNoDesc());
		for(Member mem : lst) {
			mem.memberPrn();
		}
	}	
		//번호를 내림차순으로 정렬하는 내부 클래스
		class CompareNoDesc implements Comparator<Member>{
			public int compare(Member m1, Member m2) {
				return (m1.getNo()< m2.getNo())? 1 :(m1.getNo()==m2.getNo())? 0 : -1;
			}
		}
	
		// 번호를 오름차순으로 정렬하는 내부 클래스
		class CompareNoAsc implements Comparator<Member>{
			public int compare(Member m1, Member m2) {
				//m1이 작으면 -1, 같으면 0, 크면 +1
				//					4							3						
				return (m1.getNo()< m2.getNo())? 1 :(m1.getNo()==m2.getNo())? 0 : -1;
			}
		}
	
	//이름을 오름차순으로 정렬하는 내부클래스 
	class CompareNameAsc implements Comparator<Member>{
		public int compare(Member m1, Member m2) {
			return m1.getUsername().compareTo(m2.getUsername());
		}
	}
	
	//이름을 내림차순으로 정렬하는 내부클래스(기준만들기) 
	// ** Comparator를 인텊이스에서 상속받아 compare메소드를 오버라이딩한다.
	class CompareNameDesc implements Comparator<Member>{
		//	음수, 0 , 양수	-> 음수		:	오른쪽 객체가 크다., 0	: 같다., 양수 : 왼쪽 객체가 크다. 
		//	-1, 	0, 	1
		public int compare(Member m1, Member m2) {
			//	10	,	6
			//	6		,	10
			//						홍길동											이순
			return m2.getUsername().compareTo(m1.getUsername());	// 음
			
		}
	}

	public static void main(String[] args) {
		new objectCompareTest();

	}

}
