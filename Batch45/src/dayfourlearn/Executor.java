package dayfourlearn;

public class Executor {

	public static void main(String[] args) {
		
		Base b=new Base();
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		b.varDefault=11;
		b.methodDefault();
		
		//private member can't accessible
		/*b1.varPrivate=21; 
		b1.methodPrivate();*/
		

		b.varProtected=31;
		b.methodProtected();
		
		b.varPublic=41;
		b.methodPublic();
		
		//instance of operator
		System.out.println(b instanceof Base); //returns true
		/*
		 * Person p=new Person(); System.out.println(p instanceof Base); //CTE
		 * Incompatible types
		 */
	}

}
