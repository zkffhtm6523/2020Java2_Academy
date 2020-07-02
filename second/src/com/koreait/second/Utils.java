package com.koreait.second;

public class Utils {
	public static int parseStringtoInt(String str, int rt) {
		int result = rt;
		try {
			result = Integer.parseInt(str);
		} catch (NumberFormatException e) {
		}
		return result;
	}

	public static int parseStringtoInt(String str) {
		return parseStringtoInt(str, 0);
	}

	// 오름차순
	public static int[] sortASC(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;

	}

	public static void printASC(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}

	// 내림차순
	public static int[] sortDESC(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;

	}

	public static void printDESC(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}

	public static int[] createRandomArr(int min, int max, int index) {
		int[] arr = new int[index];
		int length = max - min + 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * length) + (min));
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == arr[i] && i != j) {
					System.out.printf("i : %d, j : %d\n", i, j);
					i--;
					break;
				}
			}
		}
		return arr;
	}

	public static void printArr(int[] arr) {
		int[] arr2 = createRandomArr(5, 15, 10);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
