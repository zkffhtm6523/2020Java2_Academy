package com.koreait.second.blackjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gamer {
	List<Card> arr;

	public Gamer() {
		arr = new LinkedList<Card>();
	}

	public void receiveCard(Card card) {
		arr.add(card);
	}

	public void openCards() {
		for (Card card : arr) {
			System.out.print(card);
		}
		System.out.printf("점수 : %d\n", getTotalPoint());
	}

	// 메소드 하나는 한 역할만 한다.
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

	public void moreCards(CardDeck cd) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			openCards();
			System.out.println("-------------------------");
			System.out.println("카드 추가 : 1번\n종료 : 2번\n선택 : ");
			int select = sc.nextInt();
			if (select == 1 || select == 2) {
				if (select == 1) {
					receiveCard(cd.getCard());
					continue;
				} else if (select == 2) {
					break;
				}
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
		sc.close();
	}
}
