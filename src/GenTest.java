
public class GenTest <T> {

	public void show(T p) {
		System.out.println(p.getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		GenTest<String> obj=new GenTest<>();
	
		obj.show("abc");
		//obj.show(10);
		//obj.show(5.6);
		

	}

}
