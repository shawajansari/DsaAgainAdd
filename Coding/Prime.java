package Coding;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter integer");
		System.out.println(isParime(scn.nextInt()));

	}

	public static boolean isParime(int n) {
		if (n == 0 || n == 1) {
			return false;

		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;

			}

		}

		return true;

	}
}
