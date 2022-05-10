package programme;
//WAP to reverse words along with string.

public class reverseTheWordsOfString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome to my Life";
		String[] s2 = s1.split(" ");
		for(int i=s2.length-1; i>=0; i--) {
			String s3=s2[i];
			for(int j=s3.length()-1; j>=0; j--) {
				System.out.print(s3.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
