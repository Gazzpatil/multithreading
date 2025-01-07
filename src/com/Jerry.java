package com;

public class Jerry extends Thread {
	public void run() {
		for(int j=6;j<=10;j++) {
			System.out.println("j "+j);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
