package Coding;

import java.util.HashSet;

public class DublicateString {

	public static void main(String[] args) {
		int[] ch = { 1, 2, 3, 4, 5, 6, 7, 65, 5, 3, 5, 4, 3 };
		HashSet<Integer> unickelement = new HashSet<>();
		for (int element : ch) {
			if (!unickelement.add(element)) {
				
				System.out.print(element+",");
			}
		}
		System.out.println();
		System.out.print(""+unickelement);
	
	}

}
