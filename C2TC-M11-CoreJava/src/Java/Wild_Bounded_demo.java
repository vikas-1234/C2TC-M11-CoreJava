package Java;

import java.util.Arrays;
import java.util.List;

public class Wild_Bounded_demo {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		System.out.println(sum(list1));
		
		
		List<Double> list2=Arrays.asList(1.0,2.1,3.2,4.3,5.4);
		System.out.println(sum(list2));

	}
	
	//	 Sum Operation
	static double sum(List<? extends Number> list)
	{
		double sum=0.0;
		for(Number i:list)
		{
			sum+=i.intValue();
		}
		return sum;
		
		
	}

}
