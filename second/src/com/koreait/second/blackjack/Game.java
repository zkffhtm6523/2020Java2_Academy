package com.koreait.second.blackjack;

public class Game {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Card c = cd.getCard();
		System.out.println(c);
		System.out.println("--------------");
		System.out.println(cd);
	}
}
