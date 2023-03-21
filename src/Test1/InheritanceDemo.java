package Test1;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceA obj1=new InheritanceA();
		InheritanceB obj2=new InheritanceB();
		
		obj1.i=10;
		obj1.j=20;
		obj1.showij();
		
		
		obj2.k=30;
		obj2.i=40;
		obj2.j=50; 
		obj2.showij();
		obj2.showk();
		

	}

}
