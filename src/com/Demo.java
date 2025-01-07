package com;

public class Demo {
	public static void main(String[] args) {
		
		Thread t1=new Thread();
		System.out.println(t1.getName());
		System.out.println("----------------");
		Thread t2=new Thread("car Thread");
		System.out.println(t2.getName());
		
		
		
//		Thread t1=new Thread();
//		System.out.println(t1.getId());
//		System.out.println(t1.getName());
//		System.out.println(t1.getPriority());
//		
//		t1.setName("wolvorine");
//		t1.setPriority(2);
//		System.out.println(t1.getName());
//		System.out.println(t1.getPriority());
//		
//		Tom t=new Tom();
//		t.setName("Tom");
//		System.out.println("Thread name is "+t.getName());
//		t.start();
//		
//		Jerry j=new Jerry();
//		j.setName("jerry");
//		System.out.println("thread name is "+ j.getName());
//		
//		j.start();
		
		
	}
}
