package dayeleven;

class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse Thread ID is"+Thread.currentThread().getId());
	}
}

class SketchBook extends Thread{
	public void run() {
		System.out.println("SketchBook Thread ID is "+ Thread.currentThread().getId());
	}
}

class Chrome extends Thread{
	public void run() {
		System.out.println("Thread ID is "+ Thread.currentThread().getId());
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		
		Eclipse e=new Eclipse();
		e.start();
		
		SketchBook sb=new SketchBook();
		sb.start();
		
		Chrome c=new Chrome();
		c.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread ID is "+ Thread.currentThread().getId());
					}
	}

}
