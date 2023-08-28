package Test1;
public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 + operator in java has 2 different behaviors
		 It is used for addition numeric values
		 It is used for contamination of strings
		 */
		
		System.out.println(10+20);
		System.out.println(10+"20");
		System.out.println("10"+"20");
		System.out.println("10"+20);
		
		int a=5;
		//pre increment
		System.out.println(++a);
		//post increment
		int b=8;
		System.out.println(b++);
		int c=b;
		System.out.println(c);
	}
	
	
	}
