package dayeleven;

class Eclips implements Runnable{
	public void run() {
		for (int i=0; i<5;i++)
			System.out.println("Eclipse Thread ID is "+ Thread.currentThread().getId());
		
	}
}
public class MultiThreadingDemo {

	public static void main(String[] args) {
		Eclips obj = new Eclips();
		Thread obj1 = new Thread (obj);
		obj1.start();
		
		System.out.println("Main thread ID is"+ Thread.currentThread().getId());

	}

}
