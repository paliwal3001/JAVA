package programme;
//WAP to print maximum number of an array without using sorting

import java.util.Iterator;

public class arrayFirstMinimumNumberWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,9,7,12,17,3};
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) {
			
				if (max<a[i]) {
					 max=a[i];
			}
		}
		System.out.println(max);
	}

}
