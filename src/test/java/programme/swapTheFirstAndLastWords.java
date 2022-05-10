package programme;

public class swapTheFirstAndLastWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome to jungle";
		String[] s2=s1.split(" ");
		String temp=s2[0];
		s2[0]=s2[s2.length-1];
		s2[s2.length-1]=temp;
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i]+" ");
		}
		

	}

}
