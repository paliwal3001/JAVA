package programme;

public class mock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a2b3c4a1";
		// Output should be aabbbcccc
		
		for (int i = 0; i < s.length()-1; i=i+2) {
			
			int n=s.charAt(i+1)-48;
			while(n>0)
			{
				System.out.print(s.charAt(i));
				n--;
			}
		}
	}

}
