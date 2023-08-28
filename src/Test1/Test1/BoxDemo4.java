//Object Oriented Programming # 07

//Feb 5th Video 2.37 - 2.43
//relation -> ConstructorExample and BoxDemo4
package Test1;
class BoxDemo4{
	
	public static void main(String[] args) {
	
		double v; //type of data returned by the method should be compatible with variable receiving the value. That means "v" and "volume" should be in same data type
		
		ConstructorExample b1 = new ConstructorExample(10, 5, 3); //constructor for a class is called automatically when object is created
		v = b1.volume(); //the function of "width*height*depth" from method "volume" in Box1 is returned here
		System.out.println("Volume is " + v);
		
				
		ConstructorExample b2 = new ConstructorExample(15,20,25);
		v = b2.volume(); // volume of object b2
		System.out.println("Volume is " + v);

		
		ConstructorExample b3 = new ConstructorExample(50,100,150);
	 	v = b3.volume(); // volume of object b2
		System.out.println("Volume is " + v);
		
		
		
	}
	
	
	
	
	
}
