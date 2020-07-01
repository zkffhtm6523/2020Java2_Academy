package com.koreait.second;

public class Gugudan {
	public static void main(String[] args) {
		gugudan(2, 5);
	}

	public static void gugudan(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			for (int j = 1; j < 10; j++) {
				if ((i * j) % 2 == 0) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
			System.out.println("-----------");
		}
	}
}
