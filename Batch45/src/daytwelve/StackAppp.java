package daytwelve;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StackAppp {
	void Display(List<String>list) {
		Iterator<String> obj=list.iterator();
		
		while(obj.hasNext()) {
			System.out.println("elements are "+obj.next());
		}
	}
	
	public static void main(String[] args) {
		List<String> obj1=new LinkedList<>();
		obj1.add("rahul");
		obj1.add("pranali");
		obj1.add("kapil");
		obj1.add("prince");
		
		StackAppp app=new StackAppp();
		app.Display(obj1);
;
	}

}
