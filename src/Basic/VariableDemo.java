package Basic;
public class VariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare a variable and initialisation 
		int a=129;
		//final int a=129; // if we initiate the value as final we cann't declare it again
		// Any variable declared with final keyword cannot be reinitialized again
			//-128 and +127
			
		System.out.println(a);
		
		float b = 2.5f;
		System.out.println(b);
		
		char ch='A';
		System.out.println(ch);
		
		boolean result = true;
		System.out.println(result);
		
		// Reinitialize to other values we can change the value anytime in the program unless it has declared as "Final"
		System.out.println("--- reassign new values to variables of 4 different data types---");
		a=250;
		System.out.println(a);
		b=5.5f;
		System.out.println(b);
		ch='B';
		System.out.println(ch);
		result=false;
		System.out.println(result);
	}

}
