package programme;

import java.util.LinkedHashSet;

public class printLocationOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hii hii what are are are";
		String[] str=s.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length; i++) {
			set.add(str[i]);
		}
		for(String st: set) {
			
			for(int i=0; i<str.length; i++) {
				if(st.equals(str[i])) {
					System.out.println(st+" "+(i+1));
					break;
				}
				
			}
			
		}
		
	}
}
