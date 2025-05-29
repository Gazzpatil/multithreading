package durgasoft;

public class DaemonThread {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().isDaemon());
//	Thread.currentThread().setDaemon(true);
	Thread t1=new Thread1();
	System.out.println(t1.isDaemon());
	
	t1.setDaemon(true);
	System.out.println(t1.isDaemon());
	t1.start();
	System.out.println("main thread is destroyed");
}
}

class Thread1 extends Thread{
	public void run() {
		
		for(int i=1;i<10;i++) {
			
			System.out.println("-"+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.getMessage();
			}
	}
}}