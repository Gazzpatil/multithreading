package durgasoft;

import java.time.LocalDate;

class Display{
	public synchronized void wish(String name) throws InterruptedException {
		for(int i=0;i<5;i++) {
			System.out.print("Good Moring :");
			
			Thread.sleep(2000);
			System.out.println(name);
			
		}
	}
}

class Mythread extends Thread {
	Display d;
	String name;
	public Mythread(Display d,String n) {
		this.d=d;
		this.name=n;
	}
	
	public void run() {
		try {
		d.wish(name);}
		catch(InterruptedException e) {
			e.getMessage();
		}
	}
	
}


public class Syncronization {
	public  static void main(String[] args) {
		Display d1=new Display();
//		Display d2=new Display();
		Mythread t1=new Mythread(d1,"gazz");
//		Mythread t2=new Mythread(d2, "patil");
		t1.start();
//		t2.start();
		
	}
	
	
/*
 
 *)synchronized is a modifier applicable only for method and block and not for 
 classes and variables.
 *)If multiple threads are acting on the same java object then there may be a chance of data 
 inconsistency problem. 
 *)To overcome this problem we should go for synchronized keyword.
 If a method or block declared as synchronized then at a time only one thread is 
 allowed to execute that method or block at given object so that data inconsistency 
 problem will be resolved.
 
 The main advantage of synchronized key word is we can resolve data inconsistency 
 problem.
 The main disadvantage of synchronized key word is it increases waiting time of threads
 and create performance problem, hence if there is no specific requirement then it is 
 not recommended to use synchronized keyword.
 
 
 Internally syncronization concept is implemented by using lock. Every object in 
 java has a unique lock, whenever we are using synchronized keyword then only
 lock concept will come into the picture.
 If a thread wants to execute synchronized method , first it has to get lock of that
 object. Once the thread gets the lock then it is allowed to execute any synchronized
 method on that object.
 Once method execution completes automatically thread releases the lock.
 Acquiring and releasing lock will internally take care  by jvm and programmer not
 responsible for this activity.
 
 +) While a thread is executing synchronized method on the given object the remaining
 thread are not allowed to execute any syncronized method of same object, But 
 remaining are allowed to execute non sync methods simultaneously.
 
 
 
 
 
 
 
 
 
 */
}





/*
  public class ReservationSystem{
  	 checkAvailability(){
  	  
  	  for just read operation we can have our method as non syncronized 
  	  and any number of threads can access at a time.
  	  
  	  
  	 }
  	 
  	 synchronized  bookTicket(){
  	 
  	 for update or creating we can make our method as synchronized
  	 so, at a time only one thread should access it.
  	 
  	 }
 */
/*
 Display d1=new Display();
		Display d2=new Display();
		Mythread t1=new Mythread(d1,"gazz");
		Mythread t2=new Mythread(d2, "patil");
		t1.start();
		t2.start();
		
		
		
		
		
		
		
Even though wish msg is synchronized we will get IRREGULAR output because 
threads are operating on different java object.
REASON:If multiple threads are operating on same java object then synchronization is required.
If multiple threads are operating on multiple java objects, then syncroization is 
not required.
		
		
		
Every class in java has a unique lock which is called as class level lock.
If a thread wants to execute static synchronized method then thread requires class
level lock. ONce thread got class level lock then it is allowed to execute any
synchronized method of that class.
Once method execution completes thread releases the lock.

		
		
		
 */














