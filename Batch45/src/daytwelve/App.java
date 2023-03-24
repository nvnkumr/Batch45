package daytwelve;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
	void Display(List<String>list) {
		Iterator<String> obj=list.iterator();
		
		while(obj.hasNext()) {
			System.out.println("elements is: "+obj.next());
		}
	}
	
	public static void main(String[] args) {
		
		List<String> obj1=new LinkedList<>();
		obj1.add("Prince");
		obj1.add("Komal");
		obj1.add("Rahul");
		
		App obj3=new App();
		obj3.Display(obj1);
	}

}
