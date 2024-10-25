package edu20240729;

public class _02_RunableTest implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<5; i++) {
			System.out.println("Runable을 구현한 스레드");
			try {
				Thread.sleep(500); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
