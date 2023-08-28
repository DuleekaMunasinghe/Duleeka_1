package Test1; 
public class Multiple_If_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WAP to calculate division obtained by student
		// when percentage of marks are given
		
		int marks = 50;
		
		if (marks > 60)
			System.out.print("first Division");
		else if (marks > 50 && marks <=60)
			System.out.print("Second Division");
		else if (marks > 35 && marks <=50)
			System.out.print("Third Division");
		else 
			System.out.print("Forth Division");
			

	}

}
