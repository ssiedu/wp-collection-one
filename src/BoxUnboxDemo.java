import java.util.Stack;

public class BoxUnboxDemo {

	
	public static void disp(int i) {
		
	}
	public static void show(Object obj) {
		
	}
		
	public static void main(String[] args) {
		
		Integer obj=new Integer(50);
		disp(obj);//auto-unboxing
		disp(obj.intValue());//unboxing
		/*show("abcd");
		show(10);//new Integer(10)
		show(1.23);//new Double(1.23)
		*/
		
	}

}
