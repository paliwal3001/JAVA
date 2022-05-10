package programme;
// WAP to print the number of words/ repeated words in string.

import java.util.LinkedHashSet;

public class printNumberOfRepeatedWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="why why why mr anderson why";
		
		String[] str=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(String s1: str) {
			set.add(s1);
		}
		//System.out.print(set);
		//here we want to compare word by word
		for(String s2: set) {
			int count=0;
			for(String s3:str) {
				if(s2.equals(s3)) {
					count++;
				}
			}
			System.out.println(s2+"="+count);
		}

	}

}
