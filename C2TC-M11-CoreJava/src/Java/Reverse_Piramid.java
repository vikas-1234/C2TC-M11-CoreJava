package Java;

import java.util.Iterator;

public class Reverse_Piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4;
		//Uppar Loop
		for (int i = 0; i < row; i++) {
			//Inner Loop
			for (int j = 0; j <=i; j++) {
				System.out.print(" ");
				
			}
			//Inner Loop
			for (int j = 0; j < row-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
