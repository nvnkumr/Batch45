package dayten;

public class App_New {

	void validate (int age)
	{
		if(age <18) {
			throw new ArithmeticException("cause their age is less");
		}
		else {
			System.out.println("they are eligible");
		}
	}
	
	public static void main(String[] args) {
		App_New an=new App_New();
		an.validate(18);

	}

}
