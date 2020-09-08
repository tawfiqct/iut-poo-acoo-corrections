package livre;

public class B extends A{

	public B(){
		super(1);
	}
	
	@Override
	public  void test(final int a, int b){
		super.test(a, b);
		System.out.println("B");
	}
	
	public static void m(){
		System.out.println("B");
		
		B unObjetB = new B();
		
		A.m();
		((A) unObjetB).m();
	}
}
