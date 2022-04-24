package Java;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOfInteger=new int[] {5,6,7};
		int[] array= {2,4,6,8,10};
		int[][] multi= {
				{1,2},
				{3,4},
				{5,6}
				};
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[4]);
//		System.out.println(array[5]);
		System.out.println("Size of first array in multidomentional array"+multi[0].length);
	}

}
