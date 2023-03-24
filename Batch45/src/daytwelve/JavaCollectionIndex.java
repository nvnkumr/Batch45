package daytwelve;

import java.util.LinkedList;
import java.util.List;

public class JavaCollectionIndex {

	public static void main(String[] args) {
		List<String> obj=new LinkedList<>();
		obj.add("Amith");
		obj.add("akash");
		obj.add("Trupti");
		obj.add("Guru");
		// search by string (name) and find out position 
		
		System.out.println(obj);
		System.out.println(obj.indexOf("Amith")); 
	}

}
