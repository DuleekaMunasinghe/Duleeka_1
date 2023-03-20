
//1. Class is having Default access modifier 
package Test1;
class defAccessSpecifier
{ 
	void display() 
	{ 
		System.out.println("You are using defalut access specifier"); 
	} 
} 

public class accessSpecifiers1 {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		// how to access non - sub class , obj is the name of themethod and it doesn't matter wheather it changes or not  
		obj.display(); 

	}
}
