//Object Oriented Programming # 03

//Feb 5th Video 2.26 - 2.33
package Test1;
class BoxDemo{
	
	public static void main(String[] args) {
	
		double v; //type of data returned by the method should be compatible with variable receiving the value. That means "v" and "volume" should be in same data type
		Box1 b1 = new Box1(); 
				
		b1.width=10;   
		b1.height=20;
		b1.depth=15;
		v = b1.volume(); //the function of "width*height*depth" from method "volume" in Box1 is returned here
		System.out.println("Volume is " + v);
		
		
		
		Box1 b2 = new Box1();
		b2.width=25;   
		b2.height=5;
		b2.depth=16;
		v = b2.volume();
		System.out.println("Volume is " + v);
		
		
	}
	
	
	
	
	
}
