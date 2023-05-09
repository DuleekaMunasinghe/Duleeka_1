//Object Oriented Programming # 05

//Feb 5th Video 2.37 - 2.43
//relation -> Box3 and BoxDemo3
package Test1;
class BoxDemo3{
	
	public static void main(String[] args) {
	
		double v; //type of data returned by the method should be compatible with variable receiving the value. That means "v" and "volume" should be in same data type
		
		Box3 b1 = new Box3(); 
		b1.setDimension(10, 20, 15);   // 10, 20, 15 -- arguments
		v = b1.volume(); //the function of "width*height*depth" from method "volume" in Box1 is returned here
		System.out.println("Volume is " + v);
		
		
		
		Box3 b2 = new Box3();
		b2.setDimension(15, 5, 17);      
		v = b2.volume(); // volume of object b2
		System.out.println("Volume is " + v);
		
		Box3 b3 = new Box3();
		b3.setDimension(15, 5, 11);      
		v = b3.volume(); // volume of object b2
		System.out.println("Volume is " + v);
		
		
		
	}
	
	
	
	
	
}
