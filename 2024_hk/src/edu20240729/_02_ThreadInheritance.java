package edu20240729;

public class _02_ThreadInheritance extends Thread {
	@Override
	public void run() {
		for (int i = 0; i<5; i++) {
			System.out.println("Thread를 상속받은 스레드");
			try {
				Thread.sleep(500); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
