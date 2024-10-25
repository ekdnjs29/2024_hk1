package project;

import java.util.Scanner;

public class _01_Divisor { // 약수 구하기 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("약수를 구할 수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
				
		for (int i=1; i<=num; i++) {
			if (num % i == 0)
				System.out.print(i + " ");
		}
	}

}
