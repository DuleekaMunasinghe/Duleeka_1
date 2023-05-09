package Test1;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for (initiyaization, condition, iterstion)
		{
			<<ststments>>
		}
		*/
		/*
		int num;
		for (num = 10; num > 0; num--)
		{
			System.out.println("Welcome to Java programming :"+ num);
		}
			System.out.println("Statement outside for loop");
			// 2, 3, 5 , 11, 13 -- prime numbers (itself and one)
			// 4, 6, 12, 14, --- non prime numbers
			*/
		
		int num;
		boolean isPrime;
		num = 13;
		if (num < 2)
			isPrime = false;
		else
			isPrime = true;
		 for (int i = 2; i < num/i; i++)
		 {
			 if (num % i==0)
			 {
				 isPrime = false;
				 break;
			 }
		 }
		 if (isPrime)
		 {
			 System.out.println("Number is Prime Number ");
		 }
		 else
			 System.out.println("Number is not a Prime Number "); 
	}
	

}
