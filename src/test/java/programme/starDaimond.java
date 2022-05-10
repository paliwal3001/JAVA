package programme;

import java.util.Iterator;

public class starDaimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int i = 1; i < n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
				
			}
			for (int j = 1; j < i; j++) { /* remove = from j <= i */
				System.out.print("* ");
				
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
				
			}
			
			for (int j = i; j <= n; j++) {
				System.out.print("  ");	
			}
			System.out.println();
		}
			/*upward pyramid ends here*/
			// downward will start
			for(int i=1;i<=n;i++)
			{
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
				
			}
			for (int j = i; j <n; j++) {  /* remove = from j <= i */
				System.out.print("* ");	
			}
			
			for (int j = i; j <= n; j++) {
				System.out.print("* ");	
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			
			System.out.println();
			}
		}


}
