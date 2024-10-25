package edu20240729;

public class _02_ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스레드 생성 방법 2가지
		
		// 1. Runable 구현
		Runnable runObj = new _02_RunableTest();
		Thread tr = new Thread(runObj);
		tr.setPriority(10); // 우선 순위 설정 (1 ~ 10)
		tr.start();
		
		// 2. Thread 클래스 상속
		Thread thr = new _02_ThreadInheritance();		
		thr.setPriority(Thread.MIN_PRIORITY); 
		thr.start();
		
		// 메인 스레드
		for (int i=0; i<5; i++) {
			System.out.println("메인 스레드");
			try {
				Thread.sleep(500); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
