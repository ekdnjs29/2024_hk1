package project;
import java.util.Scanner;

public class _04_AmicableNumbers { // 친화수 구하기 
	// 친화수: 두수 각각의 약수의 합이 같은 수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 수: ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수: ");
		int num2 = sc.nextInt();
		
		int t1 = 0;
		for (int i=1; i<=num1; i++) 
			if (num1 % i == 0)
				t1 += i;
		
		int t2 = 0;
		for (int i=1; i<=num2; i++) 
			if (num2 % i == 0)
				t2 += i;
		
		if (t1 == t2)
			System.out.println("친화수 입니다.");
		else System.out.println("친화수가 아닙니다.");
	}

}
