package Coding;

import java.util.Scanner;

public class DeleteQuery {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a = { 1, 2, 5, 8, 33, 66, 99, 23, 45, };
		int ip=a.length-1;
		System.out.println("enter position detail to delete");
		int p=s.nextInt();
		for (int i = p; i < ip; i++) {
			a[i]=a[i+1];
			ip--;
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

	}
}
