// access the class AccessControlDemo
package Test1;
public class AccessControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessControlDemo obj1= new AccessControlDemo ();
		
		obj1.a=10;
		obj1.b=20;
		obj1.setC(30); // to access private variables you need set and get methods. all those variables should be private
		
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.getC());
		//when a member of class is public then it can accessed by any other code
		//if private then it cannot be access in other classes and sub classes 
		//it can be access by only members of its class 
		// protected applies only when inheritance is involved
		
	}

}
