
public class Demo {
	
		public static int x[];
		public static Integer y[];
	
	  public static<T> void disp(T[] p) {
		  for(T item:p) {
			  System.out.println(item);
		  }
	  }
	  public static <T> void show(T p){
	        System.out.println(p.getClass().getName());
	  }
	  
	  public static void main(String args[]) {
		  //show("abc");
		  //show(10);
		  System.out.println(x);
		  System.out.println(y);
		  
		  //Integer x[]= {10,20,30,40,50};
		  //disp(x);
		  
		  
		  
	  }
}
