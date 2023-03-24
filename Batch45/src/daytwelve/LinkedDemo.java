package daytwelve;
import java.util.LinkedList;

public class LinkedDemo {

	public static void main(String[] args) {
		LinkedList<String> obj=new LinkedList<>();
		obj.add("India");
		obj.add("USA");
		obj.add("Polaaand");
		obj.add("Pakistan");
		
		System.out.println(obj);
		//modify
		obj.set(2, "Poland");
		System.out.println(obj);
		
		obj.remove();		
		System.out.println(obj);
	}

}
