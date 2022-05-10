package programme;

public class reverseOnlyWordsNotString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i am naina";
		String[] sh=s.split(" ");
		for (int i = 0; i < sh.length; i++) {
			char[] ch=sh[i].toCharArray();
			for (int j = ch.length-1; j >=0; j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}

	}

}
