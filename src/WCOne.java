import java.util.Arrays;
import java.util.List;

public class WCOne {

	public static void disp(List<?> list) {
	//public static void disp(List list) {
		//list.add("newitem");
		System.out.println(list);
	}
	public static void show(List<? extends Number> list) {
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(10,20,30);
		List<Double> list2=Arrays.asList(1.5,2.5,3.5);
		List<String> list3=Arrays.asList("aa","bb","cc");
		
		//show(list1);
		//show(list2);
		//show(list3);
		
		disp(list1);
		disp(list2);
		disp(list3);
		
		

	}

}
