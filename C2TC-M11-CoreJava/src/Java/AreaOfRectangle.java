//Java program to calculate area of rectangle
package Java;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length and breadth of a rectangle:");
		int l=scanner.nextInt();
		int b=scanner.nextInt();
		int area=l*b;
		System.out.println("Area of Rectangle is:"+area);
	}

}
