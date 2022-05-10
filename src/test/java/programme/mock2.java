package programme;
// WAP to print the character followed by number
public class mock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a2b3c4a3";
		for (int i = 0; i < s.length(); i=i+2) {
			char ch = s.charAt(i);
			for (int j = 0; j < s.charAt(i+1)-48; j++) {
				System.out.print(ch);
			}
		}
	}

}
