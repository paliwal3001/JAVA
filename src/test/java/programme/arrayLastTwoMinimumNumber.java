package programme;

public class arrayLastTwoMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {30,20,10,50,40};
		int min=a[0];
		int smin=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (min>a[i]) {
				smin=min;
				min=a[i];
			}
			else if (smin>a[i]) {
				smin=a[i];
			}
		}
		System.out.println("Minimum value is: "+min+" And 2nd minimum is: "+smin);

	}

}
