package com.koreait.second.cafe;

public class Cafe {
	public static void main(String[] args) {
//		MenuItem mi1 = new Americano();
//		MenuItem mi2 = new Cappuccino();
//		MenuItem mi3 = new CaramelMacchiato();
//		System.out.println(mi);
//		System.out.println(mi2);
//		System.out.println(mi3);
		
		Menu menu = new Menu();
		Customer cus = new Customer();
		Barista bas = new Barista();
		//주문한 메뉴 주소값
		MenuItem choiceMenu = cus.order(menu);
		//주문한 메뉴를 받고 만든 주소값(커피를 만들어서 잔에 담음)
		Coffee coffee = bas.makeCoffee(choiceMenu);
		
		cus.drinkCoffee(coffee);
	}
}
