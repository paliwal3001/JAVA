package programme;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to the Jungle";
		String[] s1 = s.split(" ");
		/*
		for(int i=s1.length-1; i>=0; i--) {
			System.out.print(s1[i]+" ");
		}
*/
		//WAP to remove only spaces
		for(int i=0; i<s1.length; i++) {
			System.out.print(s1[i]);
		}
	}

}
