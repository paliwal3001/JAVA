package Interfa;

public class B extends A {
	
	public void test() {
		System.out.println("xyz");
	}
	public static void main(String[] args) {
		
	B obj1=new B();
	obj1.test();// xyz
	
	A obj2=obj1;
	obj2.test();	//xyz
}
}
