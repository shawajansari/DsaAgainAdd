package Coding;

import java.util.Scanner;

public class SortingElement {
	public static void main(String[] args) {
		int temp;
		int[] a = { 1, 2, 5, 8, 33, 66, 99, 23, 45,0,0 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

	}
}
