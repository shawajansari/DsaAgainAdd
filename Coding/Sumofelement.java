package Coding;

import java.util.Arrays;
import java.util.Iterator;

public class Sumofelement {
	public static void main(String[] args) {

		int[] a = {1, 2, 3, -1, -2, 4};
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			//System.out.println(sum);
		}
		System.out.print(sum+"  sum,   ");
		System.out.println("length "+a.length);

		
	
	}

}
