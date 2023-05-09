package Test1;
//example for method
// Feb 5th video 1.44 - 
public class Dog {
	//state
	//Behavior ; not mandatory have both
	// data + method = data members
	
	public int weight; // variable. public means it is accessible to variable in the class and other classes
	
	//public, private, default, protected -- modifiers, access specifier
	//<<return type>>  -- what value method will return
	//<<modifier>> <return type>  <<name>> (Parameters)
	//modifier is public (can be called from other code)
	//return type is void
	//name -- set weight
	// parameter is w
	
	public void setweight(int w) //method, if it returns the value "void" need to be put
	{
		weight=w;
	}

/*
	return type name(parameterlist)
	{
		
		
	}
*/
}
