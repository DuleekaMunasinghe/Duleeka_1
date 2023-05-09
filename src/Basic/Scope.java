package Basic;
public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x; //it is know to code within main method
		x = 10;
		if (x==10)
		{
			int y = 20; //it is know to this block
			System.out.println("Value of y:" +y);
		}
		//y=30; // it is not now here
		System.out.println("Value of x:" +x);
	}
		// scope of variable is inside the block, where it is declared
		// variable are created when scope is entered and destroyed
		//when scope is left.
	// variable will not hold the value once it is out of scope
}
