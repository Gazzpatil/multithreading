package com;

public class AmazonRun {
public static void main(String[] args) {
	Amazon a=new Amazon();
	Thread t=new Thread(a);
	t.setName("first thread constructor");
	System.out.println(t.getName());
	t.start();
	System.out.println("********fourth Constructor*********");
	Thread t1=new Thread(new Amazon(),"amazon thread");
	System.out.println(t1.getName());
	t1.start();
}
}
