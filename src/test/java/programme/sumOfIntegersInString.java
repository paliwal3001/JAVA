package programme;

public class sumOfIntegersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1b3ac2";
		char[] ch=s.toCharArray();
		int sum=0;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				int n=ch[i]-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}

}
