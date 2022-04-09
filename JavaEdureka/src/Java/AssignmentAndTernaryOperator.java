package Java;

public class AssignmentAndTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=40;
		a+=b;
		System.out.println(a);
		a-=b;
		System.out.println(a);
		a*=b;
		System.out.println(a);
		a/=b;
		System.out.println(a);
		a%=b;
		System.out.println(a);
		
		int ter=a<b ?100:200;
	    System.out.println(ter);

	}

}
