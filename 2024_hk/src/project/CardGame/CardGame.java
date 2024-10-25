package project.CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardGame {

	public List<Card> guest = new ArrayList<Card>();
	public List<Card> host = new ArrayList<Card>();
	
	public CardGame() { 
		System.out.println("\n게임을 시작합니다.");
		Distribution();
		System.out.println("\n\n중복 카드를 제거합니다.");
		Deduplication(host);
		Deduplication(guest);
		CardPrint(guest);
		Play();
	}
	
	public void Play() {
		while (host.size() !=0 && guest.size()!=0) {
			
			// guest
			System.out.println("\n\n상대의 카드를 골라주세요.");
			for(int i=0; i<host.size(); i++) {
				if (i%10 == 0)
					System.out.println();
				System.out.print("   [" + (i+1) + "]");
			}
			System.out.print("\n\n: ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			CardPick(guest, host, choice);
			if(host.size()==0)
				break;
			CardPrint(guest);
			
			System.out.println("\n\n중복 카드를 제거합니다.");
			Deduplication(guest);
			if (guest.size() == 0)
				break;
			CardPrint(guest);
			
			// host
			System.out.println("\n\n상대가 카드를 고릅니다.");
			int r = (int)(Math.random()*guest.size()+1);
			CardPick(host, guest, r);
			if (guest.size() == 0)
				break;
			Deduplication(host);
			if (host.size() == 0)
				break;
			CardPrint(guest);
		}
		
		if (host.size()==0)
			System.out.println("\n패배");
		else 
			System.out.println("\n승리");
	}
	
	// 카드 출력
	public void CardPrint(List<Card> cards) {
		for(int i=0; i<cards.size(); i++) {
			if (i%10 == 0)
				System.out.println();
			System.out.printf("%6s", cards.get(i));
		}
	}
	
	//카드 뽑기 
	public void CardPick(List<Card> p1, List<Card> p2, int i) {
		p1.add(p2.get(i-1));
		p2.remove(i-1);
	}
	
	
	// 카드 분배 
	public void Distribution() {
		System.out.println("\n카드를 분배합니다.");
		
		CardCase cardCase = new CardCase();
		List<Card> cards=cardCase.getCards();
		
		for (int i=0; i<CardCase.NUMOFCARDS/2; i++) {
			guest.add(cards.get(i));
			if(i%10==0)
				System.out.println();
			System.out.printf("%6s", guest.get(i));
		}
		
		for (int i=0; i<CardCase.NUMOFCARDS-(CardCase.NUMOFCARDS/2); i++) 
			host.add(cards.get(i+26));
	}
	
	// 중복 카드 제거 
	public void Deduplication(List<Card> cards) {		
		String s1, s2 = "";
		for(int i=0; i<cards.size();i++) {
			s1 = cards.get(i).toString().substring(1);
			int j=0;
			while (j < cards.size()) {
				s2 = cards.get(j).toString().substring(1);
				if (i!=j && s1.equals(s2)) {
					cards.remove(i);
					cards.remove(j-1);
					i = -1;
					break;
				}
				j++;
			}
		}
					
	}
	
}
