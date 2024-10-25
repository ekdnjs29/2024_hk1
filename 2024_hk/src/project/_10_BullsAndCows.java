package project;
import java.util.Arrays;
import java.util.Scanner;

public class _10_BullsAndCows {

	public static void main(String[] args) {
		// 0~9까지 중복되지 않는 랜덤 숫자 발행 
		int[] host = new int[3];
		for (int i=0; i<3;i++) {
			int r = (int)(Math.random()*10);
			for (int j = 0; j < i; j++) {
				while (host[j] == r)
					r = (int)(Math.random()*10);
			}
			host[i] = r;
		}
		
		for(int i=0; i<9; i++) {
			int[] guest = new int[3];
			
			System.out.print("예측 숫자 입력: ");
			Scanner sc = new Scanner(System.in);
			String n = sc.next();
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			for (int j=0; j<3; j++) {
				char c = n.charAt(j);
				guest[j] = (int)c-48;
			}

			for(int j=0; j<3; j++) {
				if (guest[j]==host[j])
					strike++;
				else if ((j!=0 && host[0] == guest[j]) || (j!=1 && host[1]==guest[j]) || (j!=2 && host[2]==guest[j]))
					ball ++;
				else
					out++;
						
			}
			
			if (strike == 3) {
				System.out.println("win");
				break;
			}
			else if (strike != 3 && i==8)
				System.out.println("lose");
			else if (out == 3)
				System.out.println("out");
			else if (strike != 0 && ball != 0)
				System.out.println(strike + "S, " + ball + "B");
			else if (strike != 0)
				System.out.println(strike + "S");
			else 
				System.out.println(ball + "B");	
		}	
	}
}
