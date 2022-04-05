package Java;

import org.junit.jupiter.api.*;

public class Test_Demo {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
   @RepeatedTest(10)
	void sum()
	{
	   	int a=10;
		int b=20;
		System.out.println("Sum is=");
		System.out.println(a+b);
	}
   @Test
   void display() {
	   System.out.println("TDO .......!!!!!!");
   }
   
   @Disabled
   void display2() {
	   System.out.println("TDO .......!!!!!!");
   }
}
