package Java;

public class CallByValue {

	
		// TODO Auto-generated method stub
		int data=50;
		int operation(int data) {
			data=data*2/6;
			return (data);
		}
		
		public static void main(String[] args) {
			CallByValue d=new CallByValue();
			System.out.println("Before operation value of data is:"+d.data);
			d.operation(500);
			System.out.println("After operation value of data is:"+d.data);
		}
	

}
