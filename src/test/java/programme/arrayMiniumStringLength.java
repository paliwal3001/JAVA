 package programme;

public class arrayMiniumStringLength {

	public static void main(String[] args) {
	String[] s= {"a","a","a","ab","abc","abcd","abcde","apple"};
	String min=s[0];
	for (int i = 0; i < s.length; i++) {
		if (min.length()>s[i].length()) {
			min=s[i];
		}
	}
	for (int i = 0; i < s.length; i++) {
		if (min.length()==s[i].length()) {
			System.out.println(s[i]);
		}
	}

	}

}
