import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {
		// List, Queue, Deque
		// Queue : 객체를 한쪽에서 추가 다른쪽에서 제거한다.
		// Deque : 객체를 양쪽에서 추가, 제거 할 수 있다.
		// 객체를 get()하면 컬렉션에서 객체가 지워진다.
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//데이터 추가
		ll.offer("홍길동");
		ll.offer("세종대왕");
		ll.offer("이순신");
		ll.offer("김정희");
		ll.offerFirst("Hong");
		
		// 제일 마지막 객체를 pop
		System.out.println(ll.pollLast());
		System.out.println(ll.get(1));
		
		while(!ll.isEmpty()) {//컬렉션이 비어있는지 확인 후 true, false return
			System.out.println(ll.pop());
		}
		//객체수
		System.out.println("size() ->"+ ll.size());
		
	}

	public static void main(String[] args) {
		new LinkedListTest();

	}

}
