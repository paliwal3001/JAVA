package programme;

import java.util.LinkedHashSet;


public class del {

	public static void main(String[] args) {
		String s="elephant";
		char[] ch=s.toCharArray();
		int count=0;
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u') {
				count++;
			}
		}
		
		
	}

}
