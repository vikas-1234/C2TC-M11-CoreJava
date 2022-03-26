//Leap Year Program
// 1. Century(100%=0 and 400%=0) 2000 2400
// 2. Yearly(100%!==0 and 4%=0)
package Java;

import java.util.Scanner;

public class Leap_Year_Program {

	public static void main(String[] args) {
		int y;
		System.out.println("Enter Any Year !!");
		Scanner r=new Scanner(System.in);
		y=r.nextInt();
		if (y%100==0 && y%400==0 || y%100!=0 && y%4==0) {
			System.out.println("Leap Year");
			
		} else {
			System.out.println("Not Leap Year");

		}
		
	}

}
