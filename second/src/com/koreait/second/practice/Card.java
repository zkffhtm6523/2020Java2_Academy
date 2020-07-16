package com.koreait.second.practice;

public class Card {
	public static final String[] PATTERNS = {"스페이드","클로버","다이아몬드","하트"};
	private String pattern;
	private String denomination;
	
	public Card(String pattern, String denomination) {
		this.pattern = pattern;
		this.denomination = denomination;
	}
	
	public String getPattern() {
		return pattern;
	}
	public String getDenomination() {
		return denomination;
	}
	@Override
	public String toString() {
		return String.format("P : %s,D : %s", pattern, denomination);
	}
	
}
