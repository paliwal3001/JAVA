package programme;

public class arrayFirstMinimumNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,30,50,40,20};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[0]); //first minimum number
	}

}
