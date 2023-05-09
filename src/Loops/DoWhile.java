package Loops;


import java.io.IOException;

public class DoWhile {

	public static void main(String[] args) throws IOException {
	
	{
		// TODO Auto-generated method stub
		//  when condition of expression evaluated is false
		// then body of the code not executed
		// but sometime it is required to execute body of loop at least once
		//even if the condition is false
		int num = 10;
		char choice;
		System.out.println("Do did you learn today?");
		do //evaluate (condition==true)
		{
			System.out.println("1. Condition Statements");
			System.out.println("2. Loops");
			System.out.println("3. Push code to remote repository");
			System.out.println("Choose one :");
			choice = (char)System.in.read();
			//choice = (char)Integer.parseInt(args[0]);			
			System.out.println("Value of choice :"+ choice);
			
			
		}   while (choice < '1' || choice > '3');	
			System.out.println("\n");
	
	switch (choice)
	{
	case '1':
		System.out.println("today we have learned condition statements");
		break;
	case '2':
		System.out.println("today we have learned Loops statements");
		break;
	case '3':
		System.out.println("today we have learned Git statements");
		break;
			
		}
	
	
}	
		
	

}
}