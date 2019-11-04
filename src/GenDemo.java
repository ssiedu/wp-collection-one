
import java.util.Stack;

public class GenDemo {
	public static void main(String args[]) {
		
		Stack<String> stk1=new Stack<>();
		stk1.push("abc");
		stk1.push("xyz");
		//stk1.push(10);
		//stk1.push(20);
		String res1=stk1.pop();
		System.out.println(res1);
		Stack<Integer> stk2=new Stack<>();
		stk2.push(10);
		stk2.push(20);
		//stk2.push("abc");
		//stk2.push("xyz");
		int res2=stk2.pop();
		System.out.println(res2);
		
		Stack stk3=new Stack();
		stk3.push(10);
		stk3.push(20);
		stk3.push("abc");
		stk3.push("xyz");
		String res3=(String) stk3.pop();
		System.out.println(res3);
		
		
		
		
	
		
		
	}
}
