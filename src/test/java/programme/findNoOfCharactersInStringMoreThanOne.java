package programme;
//WAP to print only duplicates and without duplicates

import java.util.LinkedHashSet;

public class findNoOfCharactersInStringMoreThanOne {

	public static void main(String[] args) {

			// TODO Auto-generated method stub
			String s="testyantra";
			LinkedHashSet<Character> sh=new LinkedHashSet<Character>();
			for (int i = 0; i < s.length(); i++) {
				
				sh.add(s.charAt(i));
			}
			for (Character chare : sh) {
				int count=0;
					for (int i = 0; i < s.length(); i++) {
						if (chare==s.charAt(i)) {
							count++;
						}
					}
					if (count>1) {
						System.out.println(chare+"="+count);
					}
					if (count==1) {
						System.out.println(chare+"="+count);
					}
					
			}

		}
}
