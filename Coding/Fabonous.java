 package Coding;

import java.util.Scanner;

public class Fabonous {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  System.out.println("enter a no");
		  int x=scn.nextInt();
		  for (int i = 2; i < x; i++) {
			  
			  if (x%i==0) {
				  System.out.println("its a fabonous no"+x);
				break;
			}
			  
			
		}
		  System.out.println();
		
	}
	


}




