package StreamApiProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FilterUsinfStream {

	public static void main(String[] args) {
		List<Integer> arraylist = Arrays.asList(2, 5, 2, 14, 6, 7);
		List<String> a2 = Arrays.asList("chandan","shawaj","jayant","raza");
		List<Integer> coll = new ArrayList<Integer>();
		List<Integer> coll1 = new ArrayList<Integer>();

		// Filter datat withour stream Api
		/*
		 * for(int n:arraylist) { if (n%2==0) { coll.add(n); } }
		 * System.out.println(coll); ---------------------------------------
		 */
		a2.stream().filter(str -> str.length()>0&&str.length()<7).forEach(r -> System.out.println(r));
		System.out.println(" ");
		/*coll = arraylist.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
		System.out.println(coll);*/
		System.out.println(" ");
		a2.stream().filter(str -> str.length()>0&&str.length()<7).forEach(r -> System.out.println(r));
	}

}
