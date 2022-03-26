//Java program to print first N natural numbers
package Java;

import java.util.Scanner;

public class FirstNNaturalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a natural number:");
		int N=sc.nextInt();
		for (int i = 1; i <=N; i++) {
			System.out.println("First N natural Number:"+i);
			
		}

	}

}
