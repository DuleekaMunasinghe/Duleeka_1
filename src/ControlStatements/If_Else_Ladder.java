package ControlStatements;
public class If_Else_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = Integer.parseInt(args[0]);
		if (month==12 || (month>=1 && month<=2))
		{
			System.out.print("Winter Season");
		}
		else if (month>2 && month<=5)
		{
			System.out.print("Summer Season");
		}
		else if (month>5 && month<=8)
		{
			System.out.print("Spring Season");
		}
		else if (month>5 && month<=8)
		{
			System.out.print("Spring Season");
		}
		else
		{
			System.out.print("Invalid Month");
		}
		
	}

}
