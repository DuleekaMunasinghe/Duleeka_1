package Test1;

public class InheritanceC extends InheritanceA {
	int i; // data members
	// i and j and showij() are also available in this C
	public InheritanceC(int a, int b)  
	{
		super.i=a;	//super key6 word is a reference variable which is used to refer immediate parent class object
		//parent i -----To access superclass variables
		i=b; //child i
	}
	void show() //method
	{
		System.out.println("value of i in parent :"+ super.i );
		System.out.println("value of i in child :"+ i );
	}

}
