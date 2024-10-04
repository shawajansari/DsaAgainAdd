package Coding;

public class FindMaxMinOfArray {
	public static void main(String[] args) {
		int[] ia= {2,4,2,4,2,6,8,9,3,44,66,22,1};
		
		int max=ia[0],min=ia[0]; 
		
		
		for (int i = 1;i< ia.length; i++) {
			if (max<=ia[i])
				max=ia[i];
			else if (min>=ia[i]) 
				min=ia[i];
		}
		System.out.println(max+"         "+min);
		
	}

}
