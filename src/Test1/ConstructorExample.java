//Object Oriented Programming # 06
//Feb 5th Video 2.51 - 
// relation -> 
//constructor is special method which we have same name as class name
//method may or may not return value, but constructors don't return value
package Test1;
public class ConstructorExample {


	// use class keyword to declare a class
	
	double width; // instance variable
	double height;// instance variable
	double depth;// instance variable
	
	ConstructorExample(double w, double h, double d)
	{
		System.out.println("Construting a box");
		width=w; 
		height=h;
		depth=d;
	}

	double volume()  // volume and instance variables data type should be the same
	{
		
		return width*height*depth; // how to access instance variable from method, volume and instance variables should be the same data type
		
	}
	
}


