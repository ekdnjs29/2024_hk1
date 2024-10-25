package project;
import java.util.Scanner;

public class _05_PerfectNumber {

	public static void main(String[] args) { // 완전수 구하기 
		// 자기자신을 제외한 약수들의 합이 자신의 수와 같은 수
		
		System.out.print("완전수 확인: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int pnum = 0;
		for (int i=1; i<num; i++) 
			if (num % i == 0)
				pnum += i;
		
		if (pnum == num)
			System.out.println(num + "은 완전수 입니다.");
		else System.out.println(num + "은 완전수가 아닙니다.");
	}

}
