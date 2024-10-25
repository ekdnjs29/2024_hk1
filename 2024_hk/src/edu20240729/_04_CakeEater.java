package edu20240729;

public class _04_CakeEater implements Runnable {
	
	private _04_CakePlate cake;
	
	public _04_CakeEater() {
		
	}
	
	public _04_CakeEater(_04_CakePlate cake) {
		this.cake = cake;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<30; i++)
			cake.eatBread();
	}
}
