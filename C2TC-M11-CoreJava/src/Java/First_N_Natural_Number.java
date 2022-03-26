// 2.	WA Java Program to Calculate the Sum of Natural Numbers
package Java;

import java.util.Iterator;
import java.util.Scanner;

public class First_N_Natural_Number {

	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("Enter no of Term");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		for (int i = 1; i <=n; i++) {
			sum=sum+i;
			
			
		}
		System.out.println("Addition of  natural numner is  : "+sum);
	}

}
