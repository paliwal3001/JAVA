package programme;
//WAP to check no of caharacters present in a String

import java.util.Iterator;
import java.util.LinkedHashSet;

public class findNoOfCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="testyantra";
		LinkedHashSet<Character> sh=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			sh.add(s.charAt(i));
			System.out.println(sh);
		}
		for (Character chare : sh) {
			int count=0;
				for (int i = 0; i < s.length(); i++) {
					if (chare==s.charAt(i)) {
						count++;
					}
				}
				System.out.println(chare+"="+count);
		}

	}

}
