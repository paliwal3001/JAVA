package programme;
//WAP to print fibonachi number before 90.


public class fibonachi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.print(fib1+" "+fib2+" ");
		for (int i = 0; i < 90; i++) {
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			if(fib3<=90) {
				System.out.print(fib3+" ");
			}
			else {
				break;
			}
			
		}

	}

}
