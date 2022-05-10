package Interfa;

import java.util.LinkedHashSet;

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="why why why mr anderson why anderson";
		String[] str=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>(); 
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		for(String st:set) {
			int count=0;
			for (int i = 0; i < str.length; i++) {
				if(st.equals(str[i])) {
					count++;
				}
			}
			System.out.print(st+"="+count+" ");
		}
	}
}
