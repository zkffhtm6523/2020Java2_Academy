package com.koreait.second.test;

public class Card {
	public static final String[] PATTERNS = {"스페이드","하트","다이아몬드","클로버"};
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
		return String.format("%s (%s)", pattern, denomination);
	}
}
