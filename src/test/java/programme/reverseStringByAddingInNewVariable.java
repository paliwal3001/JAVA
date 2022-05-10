package programme;

public class reverseStringByAddingInNewVariable {

	public static void main(String[] args) {
    String s="happy";
	String rev="";	
		char[] ch=s.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
