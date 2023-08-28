//Feb 6th video 1.15 -> 
package Test1;
public class AccessControlDemo {

	int a; //default access
	public int b; // public access
	private int c; //private access

	void setC(int i)
	{
		c=i;
	}
	int getC()
	{
		return c;
	}

}
