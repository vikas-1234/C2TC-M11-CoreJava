package Java;

public class ExampleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A obj=new A();
		 obj.f1();
		 i2.f2();
		 obj.f3();
	}

}

interface i1{
	default void f1() {
		System.out.println("Hello f1");
	}
}

interface i2{
	static void f2() {
		System.out.println("Hello f2");
	}
}

class A implements i1,i2{
	public void f1() {
		
	}
	public void f2() {
		
	}
	public void f3() {
		System.out.println("hello f3");
	}
}