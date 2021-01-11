import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorMain {

	public VectorMain() {
		
	}

	public static void main(String[] args) {
		VectorTest vt = new VectorTest();
		Vector vv = vt.getData();
		
		//컬렉션에서 객체 얻어오기
		Member m1 = (Member)vv.elementAt(2); //상속관련 에러 -> 벡터에 들어갈때 object형으로 변화되어 들어가기 때문에
		Calendar date = (Calendar)vv.get(5);
		
		m1.memberPrn();
		System.out.println(date);
		
		System.out.println("객체의 수 -->"+ vv.size());
		//마지막 객체 얻어오기
		Random ran = (Random)vv.lastElement();
		System.out.println("난수="+ ran.nextInt());
		
		//객체 지우기
		vv.remove(3);
		vv.removeAllElements();
		System.out.println("객체의 수 -->"+ vv.size());
	}

}
