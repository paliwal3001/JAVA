package programme;

public class printAWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to jungle";
		System.out.println(s.substring(0,7));// print only welcome
		System.out.println(s.substring(0,8));// print welcome with next space
		System.out.println(s.substring(10,17));// printing space then jungle
		System.out.println(s.substring(11,17));// printing only jungle

	}

}
