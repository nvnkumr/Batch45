package dayfourlearn;

abstract class laptops{
	abstract void weight();
	abstract void model();
	abstract void speed();
	abstract void cost();
	abstract void display();
}
public class Child extends laptops {
	
	void weiht ()
	{
		System.out.println("should be less");
	}
	
	
	void model() {
		System.out.println("mnk");
	}
	void speed() {
		System.out.println("less 75km");
	}
	void cost() {
		System.out.println("97000");
	}
	void display() {
		System.out.println("clear");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.cost();
		c.display();
		c.model();
		c.speed();
		c.weight();
		
	}


	@Override
	void weight() {
		// TODO Auto-generated method stub
		
	}

}
