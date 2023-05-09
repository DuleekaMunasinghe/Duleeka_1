package Test1;
public class Registration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Student Name
		 College
		 Email ID
		 Phone Number
		 Branch
		 Year of passout
		 backlog		
		 */
		
		String name = "Duleeka Munasinghe";
		String college = "UOC";
		String email = "duleekalakm@gmail.com";
		long phone_number=253532041375810L;
		String branch = "Colombo";
		int Year_of_passout = 2005;
		boolean has_backlog = false;
		
		System.out.println("Name of student:" + name);
		System.out.println("Name of college:" + college);
		System.out.println("Email of student:" + email);
		System.out.println("phone number of student:" + phone_number);
		System.out.println("Name of branch:" + branch);
		System.out.println("passout year:" +Year_of_passout);
		System.out.println("Does he has backlog:" +has_backlog);
		
		System.out.println("Name of student:" + name + " " +email +" " +phone_number );
	}

}
