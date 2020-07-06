package com.koreait.second.blackjack;

import java.util.ArrayList;

public class Gamer {
	ArrayList<Card> arr;
	
	public Gamer() {
		arr = new ArrayList<Card>();
	}
	
	public void receiveCard(Card card) {
		arr.add(card);
	}
	public void openCards() {
		System.out.println("------카드 덱 오픈------");
		for (Card card : arr) {
			System.out.print(card);
		}
		System.out.printf("점수 : %d\n",getTotalPoint());
	}
	//메소드 하나는 한 역할만 한다.
	public int getTotalPoint() {
//		for (int j = 0; j < arr.size(); j++) {
//			System.out.print(arr.get(j));
//			sum += arr.get(j).getPoint();
//		}
		int sum = 0;
		for (Card card : arr) {
			sum += card.getPoint();
		}
		return sum;
	}
}
