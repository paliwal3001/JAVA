package programme;

public class starABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		char ch='A';
		for (int i = 1; i < n; i++) {
			for (int j =1 ; j < n; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			ch='A';/* This part is important*/
		}

	}

}
