package com.koreait.second.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> arr = new ArrayList<MenuItem>();
	
	public Menu() {
		init();
		showMenus();
	}
	private void init() {
		arr.add(new Americano());
		arr.add(new Cappuccino());
		arr.add(new CaramelMacchiato());
		arr.add(new Espresso());
	}
	
	public List<MenuItem> getArr(){
		return arr;
	}
	//메뉴 추가
	public void plusMenu(String name, int price) {
		arr.add(new MenuItem(name, price));
	}
	//Menu 생성 시 메뉴 출력
	private void showMenus() {
		System.out.println("----------Menu----------");
		for (int i = 0; i < getArr().size(); i++) {
			System.out.println((i+1)+". "+arr.get(i));
		}
		System.out.println("------------------------");
	}
	public MenuItem choose(int index) {
		return arr.get(index);
	}
	
}
