package programme;
//WAP to swap two variable without using new variable.

public class swappingTwoNumWithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=4;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
