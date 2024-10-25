package edu20240729;

public class _01_ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "안", "녕" 번갈아 가며 출력 
		
		// 작업단위 
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i<5; i++) {
					System.out.println("안");
					try {
						Thread.sleep(500); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i<5; i++) {
					System.out.println("녕");
					try {
						Thread.sleep(500); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		// start(): 스레드 run() 실행 메서드
		t1.start();
		t2.start();
	
		// 내부클래스는 부모 클래스 생성 후 사용 가능
		Thread t3 = new _01_ThreadTest().new ThreadObj();
		t3.start();
	}
	
	// Thread 클래스 상속
	class ThreadObj extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int  i=0; i<5; i++)
				System.out.println("ThreadTest: " + i);
		}
	}
}
