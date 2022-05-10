package programme;

public class printSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="s&ad*$67%!k";
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')||(ch[i]>='0'&&ch[i]<='9')) {
				
			}
			else {
				System.out.print(ch[i]+" ");
			}
		}
	}

}
