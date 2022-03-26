package Java;

public class Left_Triangle_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		// Outer Loop
		for (int i = 1; i <=n; i++) {
			//inner loop
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}

	}

}
