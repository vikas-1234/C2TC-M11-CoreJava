package Java;

import java.io.IOException;

public class Throws_Checked_Exception {

	public static void main(String[] args) throws Exception {
		
		try {
			throw new Exception();
		} catch (IOException e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}

}
