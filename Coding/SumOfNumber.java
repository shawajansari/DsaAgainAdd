package Coding;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("inter no");
		int n=scn.nextInt();
		int sum =0;
		int r=0;
		while (n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
			
			
		}
		System.out.println(sum);
	
	}

}
