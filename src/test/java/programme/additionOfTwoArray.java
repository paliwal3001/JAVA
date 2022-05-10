package programme;

public class additionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b[]= {4,5,6,8};
		int count=a.length;
		if(a.length<b.length) {
			count=b.length;
		}
		
		for(int i=0; i<count; i++) {
			try {
			System.out.println(a[i]+b[i]);
		}
			catch(Exception e){
				if(a.length>b.length) {
					System.out.println(a[i]);
				}
				if(a.length<b.length) {
					System.out.println(b[i]);
				}
			}
		}

	}

}
