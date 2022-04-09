package Java;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo=new MethodOverloading();
		int a1=10;
		int b1=30;
		int c1=40;
		System.out.println("Printing a1 before passing it value:"+a1);
		Integer result=mo.add(a1,b1);
		System.out.println("Printing a1 after passing it value to add method :"+a1);
		System.out.println("Result of addition is:"+result);
		
		Integer resultFromNewAddMethod=mo.add(a1,b1,c1);
		System.out.println("result from new Add Method:"+resultFromNewAddMethod);

	}



public Integer add(Integer a1, Integer b1) {
	a1=100;
	Integer result =a1+b1;
	return result;
}

public Integer add(Integer a1, Integer b1, Integer c1) {
	
	Integer result =a1+b1+c1;
	return result;
}
}
