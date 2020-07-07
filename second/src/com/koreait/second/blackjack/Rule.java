package com.koreait.second.blackjack;

public class Rule {
	public static void whoisWin(Gamer gamer, Dealer dealer) {
		int failPoint = 21;
		int gPoint = gamer.getTotalPoint();
		int dPoint = dealer.getTotalPoint();
		System.out.println("----게이머 카드덱----");
		gamer.openCards();
		System.out.println("----딜러 카드덱----");
		dealer.openCards();
		if(gPoint == dPoint ||(gPoint > failPoint && dPoint > failPoint)) {
			System.out.println("비겼음");
		} else if((gPoint < failPoint && gPoint > dPoint) || dPoint > failPoint) {
			System.out.println("게이머 승");
		} else {
			System.out.println("딜러 승");
		}
		
//		if (gamer.getTotalPoint() < 22 && dealer.getTotalPoint() < 22) {
//			if (gamer.getTotalPoint() > dealer.getTotalPoint()) {
//				System.out.println("게이머가 이겼습니다");
//			} else if (gamer.getTotalPoint() < dealer.getTotalPoint()) {
//				System.out.println("딜러가 이겼습니다");
//			} else {
//				System.out.println("비겼습니다.");
//			}
//		} else if(dealer.getTotalPoint() > 22 && gamer.getTotalPoint() <= 22) {
//			System.out.println("게이머가 이겼습니다");
//		} else {
//			System.out.println("딜러가 이겼습니다.");
//		}
	}
}
