//Object Oriented Programming # 04
//Feb 5th Video 2.33 - 2.45
// relation -> Box3 and BoxDemo3
package Test1;
public class Box3 {

	// use class keyword to declare a class
	
	double width; // instance variable
	double height;// instance variable
	double depth;// instance variable
	

	double volume()  // volume and instance variables data type should be the same
	{
		
		return width*height*depth; // how to access instance variable from method, volume and instance variables should be the same data type
		
	}
	//set dimension of a box
	void setDimension(double w, double h, double d)
	{ 
		width=w; //w,h,d are called parameters
		height=h;
		depth=d;
	} 
}





