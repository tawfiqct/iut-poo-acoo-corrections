package livre;

public class A {

	private int a;
	
	public int getA(){
		return a;
	}
	
	public A(int a){
		this.a = a;
	}
	
	public void test(final int a, int b) {
		System.out.println("A");

	}

	public static void m() {
		System.out.println("A");
	}

	@Override
	public boolean equals(Object arg0) {
		
		return this.a == ((A) arg0).getA();
		
	}
	
}
