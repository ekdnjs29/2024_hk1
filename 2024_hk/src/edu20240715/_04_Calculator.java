package edu20240715;

public abstract class _04_Calculator implements _04_Calc {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	
	// 현재 클래스에서 구현하기 힘든 상황 -> 상속강요 (추상메서드) 
	@Override
	public abstract int times(int num1, int num2);

	@Override
	public abstract int divide(int num1, int num2);

}
