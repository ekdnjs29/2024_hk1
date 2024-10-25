package project;
import java.util.Scanner;

public class _03_LCM { // 최소공배수 구하

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수: ");
		int num2 = sc.nextInt();
		
		int gcd = 0;
		for (int i=1; i<=num1; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				if (gcd < i)
					gcd = i;
		}
		int lcm = (num1 * num2)/gcd;
		
		System.out.println("최소공배수: " + lcm);
	}

}
