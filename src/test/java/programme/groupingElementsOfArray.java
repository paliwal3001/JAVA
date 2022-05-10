package programme;

public class groupingElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,0,1,1,0,1,0,0,};
		int s=0;
		int l=a.length-1;
		int b[]=new int[a.length];
		for(int i=0; i<a.length; i++) {
			if(a[i]!=1) {
				b[s]=a[i];
				s++;
			}
			
			else {
				b[l]=a[i];
				l--;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			
		}

	}

}
