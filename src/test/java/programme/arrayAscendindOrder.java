package programme;
//Bubbleshort programme
// WAP to arrange numbers of array in ascending order

import java.util.Iterator;

public class arrayAscendindOrder {

	public static void main(String[] args) {

		int[] ar= {10,30,50,40,20};
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if (ar[i]>ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
			
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		/*
		for (int i : ar) {
			System.out.println(i);
		}
	*/
		/*if we want to print in descending order */
		/*
		for (int i = ar.length-1; i >= 0; i--) {
			System.out.println(ar[i]);
		}
		*/
	}
}

