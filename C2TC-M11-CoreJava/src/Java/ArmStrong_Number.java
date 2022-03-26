//Check Armstrong Number
// input number 153 ---> (1*1*1+5*5*5+3*3*3)
package Java;

import java.util.Scanner;

public class ArmStrong_Number {

	public static void main(String[] args) {
		int n, rem,arm=0,c;
		System.out.println("Enter any Number");
		Scanner  kb=new Scanner(System.in);
		n=kb.nextInt();
		c=n;
		while (n>0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
			
			
		}
		if (c==arm) {
			System.out.println("Number is armstrong");
			
		}
		else {
			System.out.println("Number is not armstrong");
		}
		

	}

}
