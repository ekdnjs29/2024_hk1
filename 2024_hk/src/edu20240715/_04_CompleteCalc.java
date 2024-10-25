package edu20240715;

public class _04_CompleteCalc extends _04_Calculator {

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num2!=0) 
			return num1/num2;
		else
			return _04_Calc.ERROR;
	}
	
	// 하위클래스에서 새로 추가된 매서드
	public void showInfo() {
		System.out.println("하위클래스에서 새롭게 정의된 매서드");
	}

}
