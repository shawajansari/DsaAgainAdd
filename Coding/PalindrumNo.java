package Coding;

import java.util.Scanner;

public class PalindrumNo {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		int temp = n;
		int r;
		while (n > 0) {
			r = n % 10;
			i = i * 10 + r;
			n = n / 10;

		}
		if (temp == i) {
			System.out.println("pallindrum");
		} else {
			System.out.println("not pallindrum");
		}
	}

}
