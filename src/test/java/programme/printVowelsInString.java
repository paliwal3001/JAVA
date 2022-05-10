package programme;

public class printVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s="testyantra";
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ) {
				count++;	
			}
		}
		
		System.out.println("number of vowels= " +count);
	}

}
