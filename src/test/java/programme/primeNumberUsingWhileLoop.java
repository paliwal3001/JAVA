package programme;

public class primeNumberUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int j=2;
		while(j<n) {
			if(n%j==0) {
				break;
			}
			else {
				j++;
			}
		}
		if(j==n) {
			System.out.println(n+" is prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}

	}

}
