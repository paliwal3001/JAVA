package programme;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int n=num;
		int sum=0;
		while(n>0) {
			int ld=n%10;
			sum=sum+ld;
			n=n/10;
		}

		System.out.println("sum of numbers of "+num+" is ="+sum);
	}

}
