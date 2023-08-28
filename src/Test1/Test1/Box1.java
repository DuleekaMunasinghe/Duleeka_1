//Object Oriented Programming # 02
//Jan 30th video 04.15 - 04.47 
// Feb 05th Video 00.57 - 
//Feb 5th Video 2.24 - 
package Test1;
public class Box1 {

	// use class keyword to declare a class
	
	double width; // instance variable
	double height;// instance variable
	double depth;// instance variable
	
	//instance variable
	//state - identify object = data
	//behavior -- actions which we perform on data -- methods
	//data + methods = data members
	//a user defined data type, it is used to create objects
	//it is an template for an object
	//we provide access to data with help of methods 
	//display volume of a box
	
	double volume() // eg: how to create a method, // volume and instance variables data type should be the same
	{
		/*
		System.out.print("Volume is :" );	
		System.out.println(width*height*depth);
		*/
		return width*height*depth; // how to access instance variable from method, volume and instance variables should be the same data type
		
	}
}





