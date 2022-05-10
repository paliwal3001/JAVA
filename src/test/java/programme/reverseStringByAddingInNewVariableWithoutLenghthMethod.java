package programme;

public class reverseStringByAddingInNewVariableWithoutLenghthMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="happy";
		char[] ch=s.toCharArray();
		int count=0;
		String rev="";
		for (char c : ch) {
			count++;
		}
		for (int i =count-1; i >=0; i--) {
			rev=rev+ s.charAt(i);
		}
		System.out.println(rev);
	}

}
