package Coding;

import java.util.Iterator;
import java.util.Scanner;

public class SortElement {

	public static void main(String[] args) {
		/*
		 * Scanner scn = new Scanner(System.in);
		 * System.out.println("enter no of element"); int n=scn.nextInt(); int ia[] =
		 * new int[n]; System.out.println("enter array element"); for (int i = 0; i < n;
		 * i++) { ia[i]=scn.nextInt();
		 * 
		 * }
		 */
		int[] ia = { 2, 3, 12929, 5, 77, 7, 5, 4, 33, 66 };
		// int n=ia.length;
		for (int i = 0; i < ia.length - 1; i++) {
			for (int j = i + 1; j < ia.length; j++) {
				if (ia[i] > ia[j]) {
					int temp = ia[i];
					ia[i] = ia[j];
					ia[j] = temp;

				}

			}
		}
		for (int k = 0; k < ia.length; k++) {

			System.out.print(ia[k] + ",");
		}

	}
}
