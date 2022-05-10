package programme;
//WAP to print sum of least 3 number of array
import java.util.Iterator;

public class arraySumOfLeast3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,9,11,3,7};
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
		for (int j = 0; j <= 2; j++) {
			 sum=sum+a[j];
		}
		System.out.println(sum);
	}

}
