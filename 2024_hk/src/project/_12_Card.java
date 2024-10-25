package project;

import java.util.ArrayList;
import java.util.List;

class Card {
	// 필드 선언 
	public static final String[] DECK = {"♥", "♣", "♠", "◆"};
	public static final String[] STECK = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
	
	private String card; // DECK + STECK 형태

	public Card() { // 생성자
		init(); // 객체가 생성되면 init() 실행
	}
	
	
	// 은닉화: 매서드를 통해 접근
	public String getCard() {
		return card;
	}
	
	public void setCard(String card) {
		this.card = card;
	}

	// 카드 한장을 만드는 기능
	public void init() {
		int dIndex = (int)(Math.random()*DECK.length);
		int sIndex = (int)(Math.random()*STECK.length);
		
		setCard(DECK[dIndex]+STECK[sIndex]);
	}
	
	// Object 클래스의 메서드 오버라이딩 (Card 객체를 출력하면 매서드 실행)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return card;
	}
	
	// Card객체 내부에 card멤버필드끼리 비교하는 기능으로 재정의
	@Override
	public boolean equals(Object obj) {
		boolean isS=false;
		Card ca=(Card)obj;//Card --> Object --> Card 형변환
		if(card.equals(ca.getCard())) {
			isS=true;
		}
		return isS;
	}
	
	//equals오버라이딩하면 hashcode도 오버라이딩해야 됨
	@Override
	public int hashCode() {
		return card.hashCode()+137;
	}
}

class CardCase {
	private List<Card> cards;
	
	private static final int NUMOFCARDS=Card.DECK.length*Card.STECK.length;
	
	public CardCase() {
		cards = new ArrayList<Card>();
		shuffle();
	}
	
	public void shuffle() {
		int i = 0;
		while (true) {
			Card card = new Card();
			if (!cards.contains(card)) {
				cards.add(card);
				i++;
			}
			if (i==NUMOFCARDS)
				break;
		}
	}
	
	
	
	public List<Card> getCards() {
		return cards;
	}
}


public class _12_Card {
	public static void main(String[] args) {
//		Card card = new Card();
//		System.out.println(card.toString());
		
		CardCase cardCase = new CardCase();
		List<Card> cards=cardCase.getCards();
		for(int i=0; i<cards.size(); i++) {
			if (i%10 == 0)
				System.out.println();
			System.out.printf("%6s", cards.get(i));
		}
	}
}
