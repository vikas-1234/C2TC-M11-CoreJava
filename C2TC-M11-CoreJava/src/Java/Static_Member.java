package Java;

public class Static_Member {

	public static void main(String[] args) {
		Hello h1=new Hello();
		Hello h2=new Hello();
		
		// calling static method 
		Hello.fun2();
		System.out.println(Hello.Hello1.country);

	}

}

class Hello{
	int x;// Instance Variable
	private static int y;// static member variable
	
	public void fun1() {} // instance member function
	public static void fun2() {} // static member function
	
	static class Hello1{
		public static String country="INDIA";
	}
}