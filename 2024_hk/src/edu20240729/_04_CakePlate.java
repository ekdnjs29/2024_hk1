package edu20240729;

public class _04_CakePlate {
	
	private int breadCount=0;
	
	public synchronized void makeBread() {
		if(breadCount >= 10) {
			System.out.println("빵이 남는다");
			try {
				wait(); // 일시 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		breadCount++;
		System.out.println("빵을 한 개 더 만듦 총: " + breadCount +"개");
		this.notifyAll(); // 모든 스레드 실행대기 
	}
	
	public synchronized void eatBread() {
		if(breadCount < 1) {
			System.out.println("빵이 모자라 기다림");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		breadCount--;
		System.out.println("빵을 한 개 먹음 총: " + breadCount + "개");
		this.notifyAll();
	}
}
