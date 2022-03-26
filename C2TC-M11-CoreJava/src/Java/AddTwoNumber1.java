//Java program to add two numbers with user input
package Java;

import java.util.Scanner;

public class AddTwoNumber1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum of a and b is:"+c);
	}

}
