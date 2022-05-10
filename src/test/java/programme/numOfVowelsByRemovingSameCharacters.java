package programme;
//WAP to print num of vowels by removing duplicate characters

import java.util.LinkedHashSet;

public class numOfVowelsByRemovingSameCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="elephant";
		char str[] = s.toCharArray();
		LinkedHashSet<Character> list=new LinkedHashSet<Character>();
		for(Character ch: str ) 
		{
			list.add(ch);
		}
		int count=0;
		for(Character ch1: list) 
		{
			if(ch1 == 'a' || ch1 =='e' || ch1 =='i' || ch1 =='o' || ch1 =='u' ) 
			{
				count++;
				System.out.print(ch1);
			}
		}
		System.out.print("="+count);

	}

}
