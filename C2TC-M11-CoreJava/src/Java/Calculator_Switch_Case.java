//Make a Simple Calculator Using switch...case
package Java;

import java.awt.print.Printable;
import java.util.Scanner;

public class Calculator_Switch_Case {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num1:");
		double num1=sc.nextDouble();
		
		System.out.println("Enter num2:");
		double num2=sc.nextDouble();
		
		System.out.println("Enter Operator(+,-,*,/)");
		char operator=sc.next().charAt(0);
		double result;
		switch (operator) {
		case '+':
			result=num1+num2;
			
			break;
		case '-':
			result=num1-num2;
			
			break;
		case '*':
			result=num1*num2;
			
			break;
			
		case '/':
			result=num1/num2;
			
			break;

		default:
			System.out.println("Sorry!!!! Operator is incorrect");
			return;
		}
	        System.out.println(num1+ " " + operator + " "+ num2+ " = "+ result);
		

	}

}
