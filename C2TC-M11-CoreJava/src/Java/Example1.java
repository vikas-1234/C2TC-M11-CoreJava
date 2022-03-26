package Java;

import javax.swing.Box;

class Example{

	
		
		private int length, breadth,height;   //Instance Member Variable
		public void setDimention(int l, int b,int h) {   // Instance Member Funtion
			length=l;
			breadth=b;
			height=h;
			
		}
		public void showDimention() {   // Member Funtion
			System.out.println("L="+length);
			System.out.println("B="+breadth);
			System.out.println("H="+height);
		}

}

class Example1{
	public static void main(String[] args) {
		Example smallBox=new Example();
		smallBox.setDimention(12, 10, 5);
		smallBox.showDimention();
		
		
		
		
	}
}
