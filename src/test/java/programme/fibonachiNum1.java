package programme;
//WAP to print first 10 fibonachi number.

public class fibonachiNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.print(fib1+" "+fib2+" ");
		for(int i=0; i<8; i++) {    /*Ipmt --> sice we have already printed 0 and 1 above thats why for loop range is between 0 to 8.*/
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			
			System.out.print(fib3+" ");
		}

	}

}
