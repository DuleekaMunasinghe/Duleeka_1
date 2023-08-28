// Encapsulation is •	Binding your data and code in a single unit, and accessing data using method
package Test1;
public class BankLoan {
	//instance variable
	private String name;
	private int age;
	private double amount;
	
	public void setName (String Name) // set data 
	{
		this.name=name;
	}
	public void setAge (int age)// set/assign data 
	{
		if(age>=18 && age <=60) 
		{
			this.age=age;
		}
		else
		{
			System.out.println("NOT ELIGIBLE FOR LOAN");
		}
	}
	public void setAmount (double amount)// set data 
	{
		this.amount=amount;
	}
	
	public String  getName(String name)
	{
		return this.name;
	}
	public int  getAge(int age)
	{
		return this.age;
	}	
	public double  getAmount(double amount)
	{
		return this.amount;
	}	
	

}
