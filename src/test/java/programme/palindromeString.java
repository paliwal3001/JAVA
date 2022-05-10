package programme;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tenet";
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println(s+ " is palindrome string");
		}
		else {
			System.out.println(s+ " is not palindrome string");
		}

	}

}
