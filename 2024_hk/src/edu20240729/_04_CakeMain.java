package edu20240729;

public class _04_CakeMain {

	public static void main(String[] args) {
		// 스레드가 공유할 객체
		_04_CakePlate cake = new _04_CakePlate();
		
		// 스레드 객체 
		_04_CakeEater eater = new _04_CakeEater(cake);
		_04_CakeMaker maker = new _04_CakeMaker(cake);

		// 스레드 객체 생성
		Thread t1 = new Thread(maker);
		Thread t2 = new Thread(eater);

		t1.setPriority(8);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
	}

}
