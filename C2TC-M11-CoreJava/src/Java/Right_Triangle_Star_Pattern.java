package Java;

import java.util.Iterator;

public class Right_Triangle_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//outer loop
		for (int i = 1; i <=n; i++) {
			//Inner Loop
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
				
			}
			//Inner Loop----> Star Print
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}

	}

}
