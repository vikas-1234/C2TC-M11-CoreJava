package Java;

public class Generic {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Cont<Integer> obj1=new Cont<>();
			obj1.value=2;
			obj1.show();

		}

	}

	class Cont<T>
	{
		
		T value; 
		void show() {
			System.out.println(value);
			System.out.println(value.getClass().getName());
		}
	}
