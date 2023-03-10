package dayseven;

public class OverloadingDemo {

	public void m1(int a,String b) {
		System.out.println("1st program a="+a+" b="+b);
	}
	
	public void m1(String r,int s) {
		System.out.println("2nd program r="+r+" s="+s);
	}
	
	public static void main(String[] args) {
		OverloadingDemo h=new OverloadingDemo();
		h.m1(11, "naveen");
		h.m1("nk", 22);
	}
}
