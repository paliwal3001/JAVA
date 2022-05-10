package programme;

import java.util.Iterator;

public class arrayFirstMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {13,7,23,11,7};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
		System.out.println(a[0]);
	}

}
