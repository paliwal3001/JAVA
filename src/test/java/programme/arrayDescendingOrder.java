package programme;

import java.util.Iterator;

public class arrayDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,30,50,40,20};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);	
		}

		/*if we want to print in ascending order*/
		/*
		for (int i = a.length-1; i >=0; i--) {
			System.out.println(a[i]);
		}
		*/
	}

}
