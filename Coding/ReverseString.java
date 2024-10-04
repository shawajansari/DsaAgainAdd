package Coding;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("ente string");
		String s=scn.next();
		String sb="";
		StringBuilder sb1=new StringBuilder(s);
		//StringBuffer sb1=new StringBuffer(s);
		System.out.println(sb1.reverse());
		
		for(int i=s.length()-1;i>=0;i--)
			sb+=s.charAt(i);
			System.out.println(sb);

	}
}
