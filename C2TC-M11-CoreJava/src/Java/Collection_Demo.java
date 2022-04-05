package Java;

import java.util.ArrayList;

public class Collection_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Collection ----- List------ArrayList
		ArrayList l=new ArrayList();  // No predefined size .... no data types
		l.add(56);
		l.add(45.78);
		l.add("M11 Batch");
		l.add("a");
		l.add(null);
		l.add(2,"vikas");
		l.remove(2);
		
		System.out.println(l);

	}

}
