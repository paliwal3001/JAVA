package programme;

public class numOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="umbrella";
		int count=0;
		char[] ch = s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ) {
				count++;
				System.out.print(ch[i]);
			}
		}
		System.out.print("="+count);
	}

}
