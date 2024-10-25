package project;
import java.util.Scanner;

public class _02_GCD { // 최대공약수 구하기 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 수: ");
		int num1 = sc.nextInt();		
		System.out.print("두 번째 수: ");
		int num2 = sc.nextInt();
		
		//1
		int gcd = 0;
		for (int i=1; i<=num1; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				if (gcd < i)
					gcd = i;
		}
		System.out.println("1: " +gcd);
		
		//2
		while (true) {
			if (num1 > num2)
				num1 = num1 - num2;
			else if (num1 < num2)
				num2 = num2 - num1;
			else if (num1 == num2)
				break;
		}
		System.out.println("2: "+num1);
	}
}
