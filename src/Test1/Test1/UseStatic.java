package Test1;
//static variables 
//purpose of statics is it can create a variable or method without creating objects for particular class 
//Feb05 - video 3.21 - 3.27


public class UseStatic {
	
	//sometime it is required to define a class member, which is independent of object
	//both method and variable can be static
	static int a = 2;
	static int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method01(5);

	}
	static void method01(int x) //x is a local variable, if method01 is not declare as statics, then we can't access any value a,b and x
	// in order to access static variable, it should be in static method 
	{
		System.out.println("value of x " +x);
		System.out.println("value of a " +a);
		System.out.println("value of b " +b);
	}
	// static key words is used for memory management
	//static members of class belongs to class itself instead of class object
	//constructor can not be static 
	//Static method can be invoked without creating an object
	//static method can access static data members (static variables)
	// and change its values
	
	static { //static block 
		b=a*2;
	}
}