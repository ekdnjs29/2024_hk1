package edu20240715;

public class _04_CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_04_Calc calc = new _04_CompleteCalc(); // 인터페이스 타입으로 생성
		_04_CompleteCalc calc2 = new _04_CompleteCalc();
		
		System.out.println(calc.add(10, 20));
		System.out.println(calc.substract(10, 20));
		System.out.println(calc.times(10, 20));
		System.out.println(calc.divide(10, 20));
//		calc.showInfo(); // 부모 설계도에 공개된 매서드만 사용 가능
		_04_CompleteCalc calc3 = (_04_CompleteCalc)calc;
		calc3.showInfo(); // 자식에만 있는 매서드를 사용하려면 자식타입으로 다운 캐스팅 해야함 
	}

}
