package StreamApiProject;

import java.util.ArrayList;
import java.util.List;

class Product {
	int PId;
	String PName;
	Double Pprice;

	public Product(int pId, String pName, Double pprice) {
		super();
		PId = pId;
		PName = pName;
		Pprice = pprice;

	}
}
	public class FilterByPrice {
		public static void main(String[] args) {

			List<Product> pr=new ArrayList<Product>();
			pr.add(new Product(100, "potato", 101.0));
			pr.add(new Product(101, "Oion", 109.0));
			pr.add(new Product(102, "Banana", 199.0));
			pr.add(new Product(103, "sweet", 99.0));
			
			
			pr.stream().filter(a-> a.Pprice>100).forEach(s ->System.out.print(s.PName+","));
		

	}
}
