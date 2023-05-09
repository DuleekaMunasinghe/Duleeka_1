package Loops;
public class ForLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		for(a = 1, b = 4; a < b; a++, b--)
		{
			
			if (a==1)
			{
				continue; // skip the current step of the loop (not break the loop)
			}
			System.out.println("Value of a :" +a);
			System.out.println("Value of b :" +b);
		}

	}

}
