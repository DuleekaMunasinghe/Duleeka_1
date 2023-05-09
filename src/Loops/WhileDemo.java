package Loops;
public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		while (num>0) // evaluate (condition)==true
		{
			//if condition is true, statement inside while loop is executed
			System.out.println("Welcome to JAva programming :"+ num);
			num--;
			
		}
			
		System.out.println("First statement outside while loop");
		// if condition is false, then next line immediately following 
		//loop will be executed
		
		int a = 10, b = 20;
		while (a>b)
		{
			System.out.println("This statement is not printed");
		} 
		// we can a while condition without a body
		int i = 10;
		int j = 20;
		
		// find mid point of i and j
		while (++i < --j);
		{
			System.out.println("Value of i: "+ i + " and j : "+ + j);
		}
			System.out.println("Mid point is " + i);
		
	}
	

}
