package durgasoft;

public class PreventingThreadFromExecution {
public static void main(String[] args) throws InterruptedException {
//	Wait ()
	/*
	 * Runnable runn=()->{ for(int i=1;i<=10;i++) {
	 * System.out.println(i+" child thread"); Thread.yield(); } };
	 * 
	 * Thread t=new Thread(runn);
	 * 
	 * t.start();
	 * t.setPriority(8); for(int i=11;i<=15;i++) {
	 * System.out.println(i+" main thread"); }
	 */
	Thread currentThread = Thread.currentThread();
	
Runnable r=()->{
	try {
		currentThread.join();   // child thread  waiting for main thread      
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(int i=0;i<5;i++) {
		System.out.println("child thread "+i);
	}
};
Thread t=new Thread(r);
t.start();
//t.join();         main thread calling waiting for child thread
for(int i=0;i<6;i++) {
	System.out.println("Main thread "+i);
}



	
}

/*
 
 We can prevent thread exection from by using three methods 
 1)yield()
 2)join()
 3)sleep()
 
 
 1)yield():-> yield() causes to pause  current executing thread to give chance for
 waiting thread of same priority.
 If there are no waiting thread or all waiting thread have low priority the same 
 thread can continue its execution.
 If multiple threads waiting with same priority then which waiting thread will 
 execute we cant except, it depends on thread schedular.
 
 
 2) join():->If a thread wants to wait until another thread completes its execution 
 then we should go for join().
 ex: If a thread t1 wants to wait until completing t2 then t1 has to call t2.join
 
 If t1 executes t2.join then immediatly t1 will enter into waiting state until 
 t2 completes.
 Once t2 completes then t1 can continue its execution.
 
 
 three overloaded methods are present
 
 1. public final void join()
 2. public final void join(Long l)
 3. public final void join(Long l,int i)
 
 NOTE:- Every join method throws interrupted exception.
 
 
 */


}
