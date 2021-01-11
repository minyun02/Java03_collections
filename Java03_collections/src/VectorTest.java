import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {

	public VectorTest() {
		
	}
	public Vector getData() {
		int num = 12;
		String name = "홍길동";
		Member member = new Member();
		Member member2 = new Member(500, "이순신", "010-7777-8888", "서울시 종로구 통인동");
		Calendar now = Calendar.getInstance();
		Random ran = new Random();
		
		//입력순서 유지, index를 가진다, 중복데이터 허용, 중간에 객체 추가/삭제/수정 가능
		Vector v = new Vector();
		//	add(E e), addElement(E obj), add(int index, E element)
		v.add(num); //0  v.add(new Integer(num)); -> 1.5,2.0버전에서
		v.addElement(name);//1
		v.add(member);//2
		v.add(member2);//3
		v.addElement(now);//4
		v.addElement(ran);//5
		
		//추가
		v.add(3, new String("hong gildong"));
		
		System.out.println("v.capacity="+ v.capacity());
		
		return v;
	}
}
