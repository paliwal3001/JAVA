package programme;
// WAP to revese string without using length()
public class reverseStringByForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="happy";
		
		char[] c=s.toCharArray();
		int count=0;
		for (char ch : c) {   /*here has.next() method is being used by iterator internally and loop control from c to ch*/
			count++;
		}
		for (int i = count-1; i >=0; i--) {
			System.out.println(s.charAt(i));
			
		}

	}

}
