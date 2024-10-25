package project;
import java.util.Scanner;

public class _07_LookAndSaySequence {

	public String lassMake(String s) {
		String lass = ""; 
		int count = 1; 
		
		if (s.length() > 1) {
			for (int i=0; i<s.length(); i++) {

				char c1 = s.charAt(i); 
				
				if (s.length() > i+1) { 
					if (c1 == s.charAt(i+1)) 
						count++; 
					else {
						lass = lass + c1 + count; 
						count = 1; 
					}
				}
				else 
					lass = lass + c1 + count; 
			}
		}
		
		else lass = s+"1";
		
		return lass;
	}
	
	public void lassPrint(int num) {
		String s = "1";
		for (int i = 1;  i<= num; i++) {
			s = lassMake(s);
			System.out.println(i+"항: "+s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("개미 수열 항: ");
		Scanner sc = new Scanner(System.in);
		
		_07_LookAndSaySequence lass = new _07_LookAndSaySequence();
		
		lass.lassPrint(sc.nextInt());
				
	}

}
