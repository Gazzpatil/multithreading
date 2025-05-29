package durgasoft;

public class InterthreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
//       System.out.println(myThread.total);
//       System.out.println(myThread.total);
//       
        synchronized (myThread) {
			myThread.wait();
			 
			System.out.println(myThread.total);
			
		}
       
        
    }
}

class MyThread extends Thread {
	int total;
    
	public void run(){
		synchronized(this){
        for(int i = 1; i<=100; i++){
            total += i;
        }
        this.notify();
        
       
        
        
    }
	}
}

/*
-> Two threads can communicate with each other by wait(), notify() and notifyAll().
 ->The thread which is expecting updation is responsible to call wait(), immediately
 the thread enters into waiting state.
 ->The thread which is responsible to perform updation, it is responsible to call
 notify(), then waiting thread will get notification and continue its execution 
 with those updated items.
 
 
 Q) Why wait(),notify() and notifyAll() are present is Object class?
 -> wait(),notify() and notifyAll() are present in Object class but not in Thread class,
 Because Thread can call these methods on any java object.
 
 
 
 ->To call wait(),notify() and notifyAll() methods on any object, thread should be 
 owner of that object.
 i.e The Thread should be inside synchronized area, hence we can call wait(),notify(),
 and notifyAll() only from synchronized area otherwise we will get runtime exception
 saying IllegalMonitorStateException.
 ->If a Thread calls wait() on any object, it immediately releases the lock on 
 that particular object and enter into waiting state.
 ->If a thread calls notify() on any object it releases the lock of that object 
 but may not immediately.
 ->except wait(), notify() and notifyAll() there is no other method where thread releases 
 the lock.
 
 
 
 $$$ Which of the following is valid $$$
 
 1. if a thread calls thread wait() immediately it will enter into waiting state
 without releasing any lock -> wrong❌
 2. If a thread calls wait() it releases the lock of that object but may not 
 immediately.wrong❌
 3.If a thread calls wait() on any object it release all locks acquired by the 
 thread and immediately enter into waiting state.wrong❌
 4.If a thread calls lock on any object it immediately releases the lock of 
 that object and enter into waiting state.right✔️
 5. If a thread calls notify() on any object it immediately releases the lock 
 of that object.wrong❌
 6.If a thread calls notify() on any object it releases the lock of that object
 but may not immediately. right✔️
 
 public final void wait() throws InterruptedExcception.
 
 public final native void wait(long ms) throws InterruptedException
 
 public final void wait(long ms, int ns) throws InterruptedException
 
 public final native void notify()
 
 public final native void notifyAll()
 
 NOTE:-> Every wait() throws interruptedException which is checked Exception
 hence when ever wait() compulsory we should handle this interrupted exception 
 either by try catch or by throws keyword.
 
 
 
 
 */
