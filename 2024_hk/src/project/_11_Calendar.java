package project;
import java.time.LocalDateTime;
import java.util.Scanner;

public class _11_Calendar {
	
	public static void calender(int year) {
		int[] lastDays = lastDays(year);
		for(int i=0;i<12;i++) {
			System.out.println(year+"년 "+(i+1)+"월 ");
			printMonth(week(year, i), lastDays[i]);
			System.out.println();
		}
	}
	
	public static void printMonth(int week, int m) {
		String[] w = {"S","M","T","W","T","F","S"};
		for(int i = 0; i< w.length;i++)
			System.out.printf("%3s", w[i]);
		System.out.println();

		String[][] month = new String[5][7];
		
		int[] day = new int[m];
		for(int i=0; i<m; i++)
			day[i] = i+1;
		
		int count=0;
		for(int i=0; i<5;i++) {
			for(int j= 0; j<7; j++) {
				if (i==0 && j<week)
					month[0][j] = " ";
				else {
					if (count < m) {
						month[i][j] = day[count] + "";
						count++;
					}
					else month[i][j] = " ";
				}
				System.out.printf("%3s",month[i][j]);	
			}
			System.out.println();
		}
	}
	
	public static int week(int year, int m) {
		int count=0;
		for (int i=1; i< year; i++ ) 
			if (leapYear(i))
				count++;
		
		int[] lastDays = lastDays(year);
		int tm =0;
		for(int i=0;i<m;i++)
			tm += lastDays[i];
			
		int week = ((year - count)*365 + (count*366) + tm)%7;
		// 0:일 1:월 2:화 3:수 4:목 5:금 6:토  
		return week;
	}
	
	public static boolean leapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		else return false;
	}
	
	public static int[] lastDays(int year) {
		int[] leapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
		int[] averageYear = {31,28,31,30,31,30,31,31,30,31,30,31};

		if (leapYear(year))
			return leapYear;
		else return averageYear;
	}
	
	public static void livednum(String s) {
		String[] birthday = s.split("-");
		int by = Integer.parseInt(birthday[0]);
		int bm = Integer.parseInt(birthday[1]);
		int bd = Integer.parseInt(birthday[2]);
		
		LocalDateTime now = LocalDateTime.now();
		int ny = now.getYear();
		int nm = now.getMonthValue();
		int nd = now.getDayOfMonth();
				
		int count=0;
		for (int i=by+1; i< ny; i++) 
			if (leapYear(i))
				count++;
		int year = ny-by-1;
		
		int[] blastDays = lastDays(by);
		int tm =0;
		for (int i=bm-1;i<blastDays.length;i++) 
			tm += blastDays[i];
		
		int[] nlastDays = lastDays(ny);
		for (int i=0;i<nm-1;i++) 
			tm += nlastDays[i];	
				
		int livednum = ((year-count)*365) + (count*366) + tm - bd + nd;

		System.out.println("살아온 일 수: " + livednum);
	}
	
	public static void main(String[] args) {
		//1
		System.out.print("year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		calender(year);
		
		//2
		System.out.print("생일(0000-00-00): ");
		String birthday = sc.next();
		livednum(birthday);
		
		
	}

}
