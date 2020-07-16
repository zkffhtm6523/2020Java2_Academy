package com.koreait.second.practice;

public class CardDeck {
	public static void main(String[] args) {
		final int LEN = 52;
		Card [] arr = new Card[LEN];
		int idx = 0;
		
		for (int i = 0; i < Card.PATTERNS.length; i++) {
			for (int j = 1; j <= 13; j++) {
				String pattern = Card.PATTERNS[i];
				String deno = "";
				
				switch (j) {
				case 1: deno = "A"; break;
				case 11: deno = "J"; break;
				case 12: deno = "Q"; break;
				case 13: deno = "K"; break;
				default: deno = String.valueOf(j); break;
				}
				
				arr[idx] = new Card(pattern, deno);
				idx++;
			}
		}
		for (Card card : arr) {
			System.out.println(card);
		}
	}
}