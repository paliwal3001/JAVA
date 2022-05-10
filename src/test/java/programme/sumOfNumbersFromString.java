package programme;

public class sumOfNumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ac$11n*22yb30c";
		int sum=0;
		int sum1=0;
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
				// 49>=48 && 49<=57
				sum=sum*10+(s.charAt(i)-48);
			}
			
			else {
				sum1=sum1+sum;
				sum=0;
			}
			
		}
		System.out.println(sum1);
	}

}
