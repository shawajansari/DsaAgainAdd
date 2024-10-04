package Coding;

import java.util.Scanner;

public class Store2DArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][4];
		System.out.print("enter value");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("print value of 3*4");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}

}
