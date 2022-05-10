 package programme;

import java.util.Iterator;

public class arrayShiftingUsingKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,2,3,4,5,6};
		int temp;
		int key=3;
		for (int i = 0; i < key; i++) {
			temp=ar[0];
			for (int j = 0; j < ar.length-1; j++) {
				ar[j]=ar[j+1];
			}
			ar[ar.length-1]=temp;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
