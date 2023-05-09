package Test1;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceA obj1=new InheritanceA();
		InheritanceB obj2=new InheritanceB();
		InheritanceC obj3=new InheritanceC(10,20);//values for i passing to both parent and chaild
		
		obj1.i=10;//Assigning new values for i and j in this class but variable declared in 
		obj1.j=20;
		obj1.showij();//method from InheritanceA
		
		
		obj2.k=30;
		obj2.i=40;
		obj2.j=50; 
		obj2.showij();//method from InheritanceA
		obj2.showk();//method from InheritanceB
		
		
		obj3.show();//method from InheritanceC 

	}

}
