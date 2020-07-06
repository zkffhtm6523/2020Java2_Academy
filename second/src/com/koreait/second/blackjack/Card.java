package com.koreait.second.blackjack;

public class Card {
	//캡슐화
	//final이 일반 변수보다 속도 빠르다.
	public final static String[] PATTERNS = { "스페이드", "하트", "클로버", "다이아몬드" };
	private final String pattern;
	private final String denomination;
	private final int point;
	//메소드와 다른 2점
	//클래스와 이름이 같고, 리턴타입이 없다
	public Card(String pattern, String denomination, int point) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	public String getPattern() {
		return pattern;
	}
	public int getPoint() {
		return point;
	}
	public String getDenomination() {
		return denomination;
	}
	@Override
	public String toString() {
		return String.format("P : %s, D : %s, P : %d\n",pattern,denomination,point);
	}
	
}
