package programme;

public class printCharIntSpecialCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="stAr13*#ca3%$";
		String str=" ";
		String num=" ";
		String spcl=" ";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>= 'A' && s.charAt(i)<='Z') {
				str=str+s.charAt(i);
			}
			
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				num=num+s.charAt(i);
			}
			
			else {
				spcl=spcl+ s.charAt(i);
			}
			
		}
		System.out.print(str+" ");
		System.out.print(num+" ");
		System.out.print(spcl);

	}

}
