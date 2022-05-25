package com.tns;

public class String1 {
	
	public static void CheckIfPPresent(char char1) {
//		char char1 = str.charAt(0);
		if(Character.toString(char1)=="P") {
			System.out.println("Positive");
		}else {
			System.out.println("non positive");
		}
	}
	
	
	public static void  IfElseCondition(String str1, String hours, String min, String sec) {
		if (str1.indexOf("H") >= 0) { // if H is present in the String
			hours = str1.substring(str1.indexOf("T") + 1, str1.indexOf("H"));
			System.out.println("hours : " + hours);

			if (str1.indexOf("M") >= 0) {  // if H  and M is present  in the String
				min = str1.substring(str1.indexOf("H") + 1, str1.indexOf("M"));
				System.out.println("min:" + min);

				if (str1.indexOf("S") >= 0) {  // if H  and M  and S is present  in the String
					sec = str1.substring(str1.indexOf("M") + 1, str1.indexOf("S"));
					System.out.println("sec:" + sec);
					
				} else {
					System.out.println("sec:" + sec); // if H  and M is present but not S  in the String
				}
			} else { // if H  is present  but M not in the String
				System.out.println("min:" + min);
				
				if (str1.indexOf("S") >= 0) { // if H  and S is present  in the String
					sec = str1.substring(str1.indexOf("H") + 1, str1.indexOf("S"));
					System.out.println("sec:" + sec);
				}else {   // if H is present but S and  M is not  present  in the String
					System.out.println("sec:" + sec);
				}
				
			}

		} else {   // if H is not  present in the String
			System.out.println("hours : " + hours);
			if (str1.indexOf("M") >= 0) {  // if H is absent  and M is present  in the String
				min = str1.substring(str1.indexOf("T") + 1, str1.indexOf("M"));
				System.out.println("min:" + min);
				
				
				if (str1.indexOf("S") >= 0) { // if H is absent but  M and S is present  in the String
					sec = str1.substring(str1.indexOf("M") + 1, str1.indexOf("S"));
					System.out.println("sec:" + sec);
					
					
				} else { // if H  and S is absent but  M is present  in the String
					
					System.out.println("sec:" + sec);
				}
			}else { // if H  and M is absent in the String
				System.out.println("min :"+min);
				if (str1.indexOf("S") >= 0) {  // if H  and M is absent but  S is present  in the String
					sec = str1.substring(str1.indexOf("T") + 1, str1.indexOf("S"));
					System.out.println("sec:" + sec);
				}else {		// if H  and M and S is absent in the String			
					System.out.println("sec:" + sec);
				}
			}
		}

		
	}
	
	
	
	
	
	public static void working(String str) // define working method
	{
		
		char char1 = str.charAt(0);
		CheckIfPPresent(char1);
		
		
		
		
		String str1 = str.substring(1);

		String hours = "0";

		String min = "0";

		String sec = "0";

		IfElseCondition(str1,hours,min,sec);

	}

	public static void main(String[] args) {

		String str = "T1S";

		working(str); // calling a method working

	}

}
