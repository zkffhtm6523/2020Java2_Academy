package com.koreait.second;

public class Gugudan {
	public static int result;

	/*
	 * public을 붙일 수 있는 클래스는 한 클래스 파일에 한 개
	 * 
	 */
	public static void main(String[] args) {
		gugudan(2, 5);
//		System.out.println(sum(1, 2, 3));
//		System.out.println(Utils.parseStringtoInt("aa10", 1));
//		System.out.println(Utils.parseStringtoInt("aa10"));

		int[] arr = { 4, 5, 11, 223, 3, 10 };
		
		Utils.sortASC(arr);
		Utils.printASC(arr); //오름차순
		Utils.sortDESC(arr);
		Utils.printDESC(arr);//내림차순
		Utils.createRandomArr(5, 15, 10);
//		Utils.printArr(arr);
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
	
	public static String makeStarTriangle(int star) {
		String str = "";
		for (int i = 0; i < star; i++) {
			for (int z = 0; z < i; z++) {
				str += "*";
			}
			str += "\n";
		}
		return str;
	}
	
	public static int sum(int... x1) {
		int sum = 0;
		for (int i = 0; i < x1.length; i++) {
			sum += x1[i];
		}
		return sum;
	}
}
