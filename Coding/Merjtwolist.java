package Coding;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Merjtwolist {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(2);
		a1.add(2);
		a1.add(2);
		a1.add(2);
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(5);
		a2.add(5);
		a2.add(5);
		a2.add(5);

		ArrayList<Integer> a3 = new ArrayList<>(a1);
		a3.addAll(a2);
		System.out.println(a3);
	}

}
