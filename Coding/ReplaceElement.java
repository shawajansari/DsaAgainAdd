package Coding;

import java.util.Scanner;

public class ReplaceElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int []a= {1,2,5,8,33,66,99,23,45};
		System.out.println("enter row value");
		int p=s.nextInt();
		System.out.println(a[p]+" replace value");
		int v=s.nextInt();
		a[p]=v;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		}

}
