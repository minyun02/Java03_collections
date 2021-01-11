import java.util.Stack;

public class StackTest {

	public StackTest() {
		// FILO : 먼저추가된 객체가 제일 마지막에 얻어진다.
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(100);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
			System.out.println("남은 객체수 ->"+ stack.size());
		}
	}

	public static void main(String[] args) {
		new StackTest();

	}

}
