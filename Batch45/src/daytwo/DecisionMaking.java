package daytwo;

public class DecisionMaking {

	public static void main(String[] args) {
		
		int x=2, y=3;
		int a=5;
		int b=6;
		
		if (x>=y) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		if (!(a<b)|| (a==b)) {          //false || false
			System.out.println("condition is true");
		}
		else {
			System.out.println("condition is false");
		}


	}

}
