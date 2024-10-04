package StreamApiProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NullValueFilter {
	public static void main(String[] args) {
		List<String> name=Arrays.asList("kanno",null,"raza",null,"summu");
		List<String>ListName=new ArrayList<>();
		
		name.stream().filter(n -> n!=null).forEach(s-> System.out.println(s));
		ListName=name.stream().filter(n -> n!=null).collect(Collectors.toList());
		System.out.println(ListName);
			
		}
		
	}


