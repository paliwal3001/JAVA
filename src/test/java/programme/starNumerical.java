package programme;

public class starNumerical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int x=1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(x+" ");
				x++;
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(x+" ");
				x--;
				
			}
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			System.out.println();
			x=1;
			
		}

	}

}
