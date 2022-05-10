package programme;

import java.util.LinkedHashSet;

//WAP to find the location of character

public class findLocationOfCharacter {

	public static void main(String[] args) {
		
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		for(Character ch:set) {
		/*
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+"="+(i+1));
					break;
				}
				*/
			/*if we have to print in reverse order location of charaters*/
			for(int j=s.length()-1;j>=0;j--) {
				if(ch==s.charAt(j)) {
				System.out.println(ch+"="+(j+1));
				break;
				}
			}
			}
		}

	}
