package StringJava;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array of characters
		// enclosed in double quotes
		//strings are objects
		// Strings are immutable
		
		char [] C = {'j','a','v','a'};
		String S1= new String(C);
		String S2= new String(S1);
		String S3= "Java";
		System.out.println(C);
		System.out.println(S1);
		System.out.println(S2);
		System.out.println("Length is :"+S2.length()); // count of characters in a String
		System.out.println("Character at index 1 : "+S2.charAt(1));
		System.out.println(S1.equals(S2));
		System.out.println(S1.equals(S3)); //Java is case sensitive
		System.out.println(S1.equalsIgnoreCase(S3)); //not case Sensitive
	
	}

}
