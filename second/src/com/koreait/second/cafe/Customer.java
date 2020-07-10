package com.koreait.second.cafe;

import java.util.Scanner;

public class Customer {
	public MenuItem order(Menu menu) {
		Scanner sc = new Scanner(System.in);
		menu.showMenus();
		int cnt = 1;
		boolean check = true;
		MenuItem mi = null;
		do {
			try {
				System.out.print("어떤 메뉴를 고르시겠습니까? : ");
				String select = sc.nextLine();
				int intSelect = Integer.parseInt(select);
				mi = menu.choose(intSelect - cnt);
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			} catch (Exception e) {
				System.out.println("메뉴를 잘 못 선택하셨습니다..");
			}
		} while (check);
		sc.close();
		return mi;
	}
	public void drinkCoffee(Coffee coffee) {
		System.out.println(coffee.getName()+"를 마신다."); 
	}
}
