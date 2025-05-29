package garbagecollection;

public class Program1 {
	void m1() {
		System.out.println("m1() called !!!!!");
		Program1 p3=new Program1();//3rd way :-> this object will be deleted after after the method 
		//has completed its execution
	}

	protected void finalize() {//	this method is called System.gc()
		System.out.println("finalize method has been invoked!!!");
	}
	
	public static void main(String[] args) {
		Program1 p1=new Program1();
		Program1 p2=new Program1();
		p1.m1();
		
//		p2=p1 // 1st way by Re-assigning the reference variable.
//		p1=null //2nd way by Nullifying the reference variable
		
		System.gc();// It is used to call the garbage colletor manually
//		Runtime runtime = Runtime.getRuntime();
//		runtime.gc();
	}
}
