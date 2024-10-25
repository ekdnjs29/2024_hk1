package edu20240715;

public interface _03_InterfaceTest {

	// 다중상속 흉내 ~extends.. Implements...
	// 인터페이스끼리 다중 구현이 가능 implements IA, IB, IC
	// 인터페이스끼리 상속 가능 public interface IA extends IB 
	
	// 상수 선언 
	public static final int A=5;
	public int B=10;
	
	// 추상메서드 
	public abstract int test();
	public int test2();
	
	// default 메서드
	public default void test3() {
		test5(); // private 메서드에 접근 가능 
		System.out.println("인터페이스를 구현한 객체가 사용");
	}
	void test4();
	
	// private 메서드: 구현한 객체에서 사용 불가, 인터페이스 내부에서만 공통기능으로 사용
	private void test5() {
		System.out.println("인터페이스 내부에서만 사용 가능");
	}
	
	// static 메서드: _03_InterfaceTest.test6()으로 호출하여 사용 가능
	public static void test6() {
		System.out.println("인터페이스만으로 실행 가능");
	}
}
