package durgasoft;

public class PreventingThreadSleep {
public static void main(String[] args) throws InterruptedException {
	Thread currentThread = Thread.currentThread();
	
	Runnable runn=()->{
		
		for(int i=1;i<=10;i++) {
			System.out.println("Preventing thread from sleep "+i);
			try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println("got interrupted!!!!!");
		}
	}
};
	
	Thread t=new Thread(runn);
	
	t.start();
	t.interrupt();
//	t.join();
	for(int i=11;i<15;i++) {
		System.out.println("main "+i);
	}


/*
 $$$ SLEEP() $$$
 
 If a thread don't want to perform any operation for a particular amount of time
 then we should go for sleep().
 
 public static native void sleep(Long ms) throws Interrupted Exception
 
 public static void sleep(Long ms,int ns) throws Interrupted Exception
 
 
 A thread can interrupt a sleeping thread or waiting thread by using interrupt() 
 method of thread class.
 
 
 NOTE:-> If the target thread does not enter into sleeping or waiting thread 
 in its life time then there is no impact of interrupt(), this is the only way 
 where interrupt call will be wasted.
 
 
 */
}}

