package Exceptions;

public class ThrowDemo1 {
	
	  	    public static void main(String[] args) {
	       
	  	    	int x=2,y=0;
	  	    	
	  	    	try{
	  	    		if(y==0)
	  	    		{
	  	    			throw new ArithmeticException();
	  	    		}
	  	    }
	        catch (ArithmeticException e) 
	  	    {
	        	System.out.println("Exception occured : Division by zero");
	  	    }
	        
	    }
	}