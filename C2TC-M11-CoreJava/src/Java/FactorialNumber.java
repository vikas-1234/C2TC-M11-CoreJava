//Java program to calculate factorial of a number
package Java;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n>=0)
		{
		int f=1;
		while (n!=0) {
			f=f*n;
			n--;
			
			
		}
		System.out.println("Factorial is:"+f);
		
	}
		else {
			System.out.println("Invalid Input!!!");
		}
	}

}
