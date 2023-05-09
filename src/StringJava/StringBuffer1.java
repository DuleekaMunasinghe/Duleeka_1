package StringJava;

public class StringBuffer1 {

    public static void main(String[] args) {
    	/*
    	StringBuffer sb = new StringBuffer();
    	sb.append("Hello");
    	System.out.println(str);
    	System.out.println(str.length());
    	*/
    	
    	

        StringBuffer str =new StringBuffer("Welcome to");
        str.append(" Java");
        System.out.println(str);


        str.insert(2, " Selenium ");
        System.out.println(str);


    }
} 