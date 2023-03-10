package dayseven;

public class Executor extends OverrideDemo{
	
	public void m1(String e,int p) {
		System.out.println("2nd demo");
	}

	public static void main(String[] args) {

		Executor obj=new Executor();
		obj.m1("sky", 23);
	}

}
