package com.koreait.second.cafe;

public class Barista {
	public Coffee makeCoffee(MenuItem choiceMenu) {
		return new Coffee(choiceMenu);
	}
}
