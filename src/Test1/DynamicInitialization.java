package Test1;
public class DynamicInitialization {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double a = 3, b = 4;
		
		double c = Math.sqrt(a*a + b*b); // initialization happens at run time
		System.out.println("Value of c is: "+ c);		
	}

}
