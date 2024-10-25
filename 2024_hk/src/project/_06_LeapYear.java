package project;
import java.util.Scanner;

public class _06_LeapYear {

	public static void main(String[] args) { // 윤년 구하기 
		// TODO Auto-generated method stub

		System.out.print("year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			System.out.println(year + "년도는 윤년입니다.");
		else System.out.println(year + "년도는 평년입니다.");
	
		System.out.println("2000 ~ 2024년도 사이의 윤년");
		for (year = 2000; year <= 2024; year++ ) 
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				System.out.print(year + "년 ");
	
	}
}