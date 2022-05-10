package programme;
//Happy nuber=78-->8+8=15--> 1+5=6
public class happyNumber {

	public static void main(String[] args) {
		int n=78;
		/* int sum=num is also correct*/
		while(n>9) {
			int sum=0;
			while(n>0) {
				int ld=n%10;
				sum=sum+ld;
				n=n/10;
			}
			n=sum;  //sum=n---> Wrong because we have to assign to n in order to verify n<9
			        // if sum=n then n=9 will be assigned to sum not digits sum will be there in sum.
		}
		System.out.println(n);
  }
}
