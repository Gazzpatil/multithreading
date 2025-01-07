package com;

public class Tom extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("i " +i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
