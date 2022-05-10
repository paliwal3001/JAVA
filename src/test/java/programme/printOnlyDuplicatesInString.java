package programme;

import java.util.LinkedHashSet;

public class printOnlyDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="why why why mr andresion why";
		String[] str=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(String s1: str) {
			set.add(s1);
		}
		//System.out.println(set);
		for(String s3: set) {
			int count=0;
			for(String s4: str) {
				if(s3.equalsIgnoreCase(s4)) {
					count++;
				}
				
			}
			if(count>1) {
				System.out.println(s3+"="+count);
			}
			System.out.println("--------");
		
			//Print only non duplicates
			if(count==1) {
				System.out.println(s3+"="+count);
			}
		}

	}

}
