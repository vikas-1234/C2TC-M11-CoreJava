package Java;

public class TypeConversionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="23";
		int num=Integer.parseInt(s);
		System.out.println(num);
		
		String s1="2333";
		Integer num1=Integer.valueOf(s1);
		System.out.println(num1);
		
		int i=23;
		String s2=Integer.toString(i);
		System.out.println(s2);
		
		String s3=String.valueOf(i);
		System.out.println(s3);
		
		
	}

}
