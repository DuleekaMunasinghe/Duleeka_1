package ControlStatements;
public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int age = 29;
		if (age>45)
		{
			System.out.println("old");
		}
		else
		{
			System.out.println("Young");
		}
		*/
		//nested if else
		int i =10;
		int j = 50;
	
		if (i==10)//f1
		{
			if (j <20) // f2
			{
				System.out.print("insede if ie f2");
			}
			else
			{
				System.out.print("else map to nearest if ie f2");
			}
		}
		else
		{
			System.out.print("elase maps to nearest if ie f1");
		}
		
	}

}
