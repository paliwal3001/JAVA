package programme;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		boolean flag=true;
		//int x=0;
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		
		}
		
		if(flag) {
			System.out.println(num+" is a prime number");
		}
		
		else {
			System.out.println(num+" is not a prime number");
		}
	}

}
