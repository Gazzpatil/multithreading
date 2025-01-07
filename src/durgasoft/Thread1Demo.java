package durgasoft;



public class Thread1Demo {
public static void main(String[] args) {
	
//	Thread.currentThread().setName("patil");
	String name = Thread.currentThread().getName();
	System.out.println(name);
	Runnable runn=()-> {
		
//		this thread is executed by Child thread !!
		for(int i=1;i<=10;i++) {
			System.out.println("hello how are you !!!!! :"+i);
		}
	};
	Thread t=new Thread(runn);
		t.start();
	System.out.println(t.getName());
//	This loop is executed by main thread !!!!!!!!!
	for(int i=10;i<=20;i++) {
		System.out.println("hello from second loop "+i);
	}
}
/*
 
 $$$  CASE STUDY  $$$$
 
 MyRunnable r=new MyRunnable();
 Thread t1=new Thread();
 Thread t2=new Thread(r);
 
 
 case1:-> t1.start(); 
 a new thread will be created which is responsible for execution of 
 thread class which has in it implementation.
 
 case2:-> t1.run();
 no new thread will be created and thread class run() will be executed 
 just as a normal method call.
 
 case3:->t2.start();
 a new thread will be created which is responsible for executing 
 MyRunnable class run();
 
 case4:-> t2.run();
 a new Thread wont be created and my runnable run() will be exectued 
 just like a normal method call.
 
 case5:-> r.start();
 we will get compile time error by saying MyRunnable class doest not have 
 start().
 
 case6:->r.run();
 no new Thread will be created and my runnable run() will be executed like 
 normal method call.
 
 
 Q) Which approach is best to define a thread?
 ->Among two ways of defining a thread implements Runnable interface is recommended.
 ->While implementing Runnable interface we can extend any other class hence
 	we dont miss any inheritance benefits.
 
 
$$$$$$ CONSTRUCTORS PRESENT IN THREAD CLASS $$$$$$$
 
 1.Thread t=new Thread();
 2.Thread t=new Thread(Runnable r);
 3.Thread t=new Thread(String name);
 4.Thread t=new Thread(Runnable r,String name);
 5.Thread t=new Thread(ThreadGroup g,String name);
 6.Thread t=new Thread(ThreadGroup g,Runnable r);
 7.Thread t=new Thread(ThreadGroup g,Runnable r,String name);
 8.Thread t=new Thread(ThreadGroup g,Runnable r,String name,Long StackSize);
 

 */



}
