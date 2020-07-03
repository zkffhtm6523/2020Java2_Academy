package com.koreait.second.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList<Card>();

	public CardDeck() {
		init();
		
	}
	private List<Card> getCardDeckArr() {
		return arr;
	}
	private void init() {
		for (int i = 0; i < Card.PATTERNS.length; i++) {
			for (int z = 1; z <= 13; z++) {
//				arr.add(new Card(Card.PATTERNS[i], getDeno(z)));
				String pattern = Card.PATTERNS[i];
				String deno = getDeno(z);
				Card c = new Card(pattern, deno);
				arr.add(c);
			}
		}
	}
	private String getDeno(int num) {
		switch (num) {
		case 1: return "A";
		case 11: return "J";
		case 12: return "Q";
		case 13: return "K";
		default: return String.valueOf(num);
		}
	}
	@Override
	public String toString() {
		for (Card c : arr) {
			System.out.println(c);
		}
		return "";
	}
	
	public Card getCard() {
		int r = (int)(Math.random()*arr.size());
		Card c = arr.get(r);
		arr.remove(r);
		return c;
	}
}

//	private void init() {
//		for (int i = 0; i < Card.PATTERNS.length; i++) {
//			for (int z = 1; z <= 13; z++) {
//				String deno = "" + (z);
//				if (z == 1) {
//					deno = "A";
//				} else if (z == 11) {
//					deno = "J";
//				} else if (z == 12) {
//					deno = "Q";
//				} else if (z == 13) {
//					deno = "K";
//				}
//				arr.add(new Card(Card.PATTERNS[i], deno));
//			}
//		}
//	}