package edu20240729;

public class _04_CakeMaker implements Runnable{
	
	private _04_CakePlate cake;
	
	public _04_CakeMaker() {
		
	}
	
	public _04_CakeMaker(_04_CakePlate cake) {
		this.cake = cake;
	}
	
	public void run() {
		for (int i=0; i<30; i++)
			cake.makeBread();
	}
}
