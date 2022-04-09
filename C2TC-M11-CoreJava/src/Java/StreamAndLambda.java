package Java;
import java.util.*;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAndLambda {

//	private static final char[] fail = null;

	public static void main(String[] args) {
		
		List<Integer> org=List.of(12,45,67,89,23,54,89,90,87,23,45,12,24,56);
		System.out.println(org);
		
		// Conventional way of programmining
		
//		List<Integer> evenList=new ArrayList<Integer>();
//		
//		for (Integer i  : org) {
//			if (i%2==0) {
//				evenList.add(i);
//			}
//			
//		}
//System.out.println(evenList);
	
		Stream<Integer> stream=org.stream();
		List<Integer> l=stream.filter(i->i<33).collect(Collectors.toList());
		System.out.println(l);
		
		long fail=l.stream().filter(i->i<33).count();
		System.out.println(fail);
		
		List<Integer> updateList=org.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updateList);
		

	}

}
