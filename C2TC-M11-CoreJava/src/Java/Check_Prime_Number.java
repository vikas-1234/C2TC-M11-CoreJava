package Java;

import java.util.Scanner;

public class Check_Prime_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		for (int i= 2; i < n; i++) {
			if (n%i==0) 
				break;
		if (i==n) 
			System.out.println("Number is prime");
		
		else 
			System.out.println("Number is not prime");
		
			
			
		}
		

	}

}
