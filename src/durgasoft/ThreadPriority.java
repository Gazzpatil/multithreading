package durgasoft;

public class ThreadPriority {
public static void main(String[] args) {
	Thread.currentThread().setPriority(6);// main thread priority 6
	int priority = Thread.currentThread().getPriority();
	System.out.println(priority+" main thread");
	Runnable runn=()->System.out.println("Hello");
	Thread t=new Thread(runn);
	System.out.println(t.getPriority()+" child thread");// child thread priority 6
	
}
/*
 
 $$ THREAD PRIORITY $$
 
 Thread priority in Java is a way to tell the program which thread is 
 more important than others. Threads with higher priority are more likely 
 to run first, but it’s not guaranteed because the operating system
 controls the actual scheduling.
 
Priority Levels:
Java provides numbers from 1 (lowest priority) to 10 (highest priority). 
The default is 5
 
Thread class defines the following constants to represent some standard priorities.
Thread.Min_Priority =1
Thread.Max_Priority=10
Thread,Norm_Priority=5


+) THREAD SCHEDULAR will use priorities while allocating processors. The Thread which is 
having higher priority will be executed first.

+) If two threads having same priority, then we cant expect exact execution order 
it depends on thread schedular.

+) Thread class defines following methods to get and set priority of a thread 
public final int getPriority();
Public final void setPriority(int i) ; Allowed valued range 1 - 10, Otherwise Illegalargument Exception.

+) The default priority only for the main thread is 5 and for all remaining threads 
will be inherited from parent to child. 
i.e whatever priority  parent thread have will be inherited to child thread.






 
 */
}
