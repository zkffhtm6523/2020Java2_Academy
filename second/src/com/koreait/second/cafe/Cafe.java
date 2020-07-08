package com.koreait.second.cafe;

public class Cafe {
	public static void main(String[] args) {
		MenuItem mi1 = new Americano();
		MenuItem mi2 = new Cappuccino();
		MenuItem mi3 = new CaramelMacchiato();
//		System.out.println(mi);
//		System.out.println(mi2);
//		System.out.println(mi3);
		
		Menu menu = new Menu();
		MenuItem mi = menu.choose(0);
		System.out.println(mi);
	}
}
