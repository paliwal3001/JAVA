package programme;
//WAP to print string containing maximum number of letter 'a' in String array.
public class arrayMaximumStringLength {

	public static void main(String[] args) {
	String[] s= {"a","ab","abc","abcd","abcde","apple"};
	String max=s[0];
	for (int i = 0; i < s.length; i++) {
		if (max.length()<s[i].length()) {
			max=s[i];
		}
		
	}
	for (int i = 0; i < s.length; i++) {
		if (max.length()==s[i].length()) {
			System.out.println(s[i]);
		}
	}

	}

}
